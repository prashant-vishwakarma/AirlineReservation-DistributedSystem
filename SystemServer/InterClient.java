 
import java.io.*; 
import java.net.*; 
import java.util.Scanner; 
 
public class InterClient  
{ 
 Socket s;
 DataInputStream dis;
 DataOutputStream dos;
 Scanner scn ;
    public InterClient() throws IOException  
    { 
        try
        { 
            s = new Socket("192.168.1.104", 1024); 
           dis = new DataInputStream(s.getInputStream()); 
           dos = new DataOutputStream(s.getOutputStream()); 
           scn= new Scanner(System.in); 
           
            System.out.println(dis.readUTF());
           
           
        }catch(Exception e){ 
            e.printStackTrace(); 
        }
        }
    void Request(String tosend) throws IOException{
       // tosend="select * from Flight;";      
        dos.writeUTF(tosend);   
    }
    
    String Response() throws IOException{
                 String received = dis.readUTF(); 
                System.out.println(received); 
               return received;
    }
    
 
} 