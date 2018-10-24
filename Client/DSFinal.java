package dsfinal;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author hp
 */
public class DSFinal {
 DataOutputStream out;
     Socket s;
     DataInputStream in;
     
     DSFinal(){
            
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));   
        try{
          
           
           String ip="192.168.43.26";
           //ip=br.readLine();
            int port=1033;
           // port=Integer.parseInt(br.readLine());
           
           
           s=new Socket(ip,port);
           
          out=new DataOutputStream(s.getOutputStream());
          in= new DataInputStream(new BufferedInputStream(s.getInputStream()));

           
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        String a=null;
      //  while(true){
            try{
                
                
                //a="";
                //a=in.readUTF();
           
             //   System.out.println(a);
                
                //out.writeUTF("hello");
                
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              DSClient2 d=new DSClient2(in,out,s);
              d.setVisible(true);
            }
        });
                
            }catch(Exception e){
                System.out.println(e);

            }
         
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new DSFinal();
    }
    
} 