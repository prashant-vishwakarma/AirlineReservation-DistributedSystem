package ultimateintermediator;

import java.io.*; 
import java.net.*; 
import java.util.logging.Level;
import java.util.logging.Logger;
  
public class Intermediate 
{ 
    DataOutputStream dos ;
    DataInputStream dis;

    public Intermediate() throws IOException
    {ServerSocket ss = new ServerSocket(1025); 
       while (true)  
        { 
    Socket s = null;   
            try 
            { s = ss.accept(); 
               System.out.println("A new client is connected : " + s); 
                dis = new DataInputStream(s.getInputStream()); 
                dos= new DataOutputStream(s.getOutputStream()); 
               
                Thread t = new ClientHandler(s, dis, dos); 
                 t.start(); 
                  
            } 
            catch (IOException e){ 
                s.close(); 
                e.printStackTrace(); 
            }
           
        } 
    } 
    public static void main(String[] args) throws IOException  
    {  new Intermediate();
    }
} 
  