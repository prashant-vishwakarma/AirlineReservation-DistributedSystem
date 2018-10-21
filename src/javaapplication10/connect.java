/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.io.BufferedInputStream;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author hp
 */
public class connect extends Thread{
        private String query;
        private Socket socket;
        private BufferedReader br;
        ObjectInputStream in;
        ObjectOutputStream out;
        
        
        
        /********sql********/
   static final String DB_URL ="jdbc:mysql://localhost:3306/server";
   static final String DB_DRV ="com.mysql.jdbc.Driver";
   static final String DB_USER = "root";
   static final String DB_PASSWD = "root";
        
       
        public connect(Socket socket) {
            this.socket = socket;
        }
        
         public void run() {
             try {
                 in= new ObjectInputStream(new BufferedInputStream(socket.getInputStream()));
                 out=new ObjectOutputStream(socket.getOutputStream());
                 
                 
                 query=in.readUTF();
                 
                 ResultSet rs=exe(query);
                 
                                      out.writeObject(rs);

                 /*
                 if(query.contains("select")){
                     out.writeObject(rs);
                 }
                 
                 else{
                     
                    // out.writeUTF();
                 }
                 
                    */
                    
                 
                 
                 
             } catch (IOException ex) {
                 Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
             }
           
         
         }
         
         
          public ResultSet exe(String query){
        
      com.mysql.jdbc.Connection connection = null;
      com.mysql.jdbc.Statement statement = null;
      ResultSet resultSet = null;

      try{
         connection=(com.mysql.jdbc.Connection) DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
         statement=(com.mysql.jdbc.Statement) connection.createStatement();
        
         
         if(query.contains("select")){
         resultSet=statement.executeQuery(query);
         return resultSet;
         }
         
         else if(query.contains("update")){
             statement.executeQuery(query);
             return null;
         }
         
         /*
         while(resultSet.next()){
            System.out.printf("%s\t%s\n",resultSet.getString(1),resultSet.getString(2));
           }
           */
      }catch(SQLException ex){
      }finally{
         try {
            resultSet.close();
            statement.close();
            connection.close();
         } catch (SQLException ex) {
         }
      }
        
        return resultSet;
    }
             

}

