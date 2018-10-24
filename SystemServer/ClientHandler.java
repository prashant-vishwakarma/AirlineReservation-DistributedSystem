package ultimateintermediator;



import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


// ClientHandler class 
class ClientHandler extends Thread  
{ 
    final DataInputStream dis; 
    final DataOutputStream dos; 
    final Socket s; 
      
  
    // Constructor 
    public ClientHandler(Socket s, DataInputStream dis, DataOutputStream dos)  
    { 
        this.s = s; 
        this.dis = dis; 
        this.dos = dos; 
    } 
  
    @Override
    public void run()
    { 
        String received; 
         Scanner scn = new Scanner(System.in); 
              
       
            try { 
              InterClient IC =new InterClient();
                received="COMPLETE";
                //received = dis.readUTF(); 
                System.out.println(received);
                
                switch(received){
                    case "Hi":
                    IC.Request("Hi");
                    System.out.println(IC.Response());
                    break;
                    
                    case "SEARCHFLIGHTS":
                       received="Select * from Flight;";
                       // received=dis.readUTF();
                       // System.out.println(received);
                        IC.Request("SEARCHFLIGHTS");
                         IC.Request(received);
                         String tosend="";
                              while(tosend!="FINISH"){
                                    tosend=IC.Response();
                                    dos.writeUTF(tosend); 
                                    }
                         break;
                    
                    case "CHECKSEATS":
                      received="Select * from seats where flight_no='i01';";    
                      // received=dis.readUTF();
                       // System.out.println(received);
                        IC.Request("CHECKSEATS");
                        IC.Request(received);
                         tosend="";
                              while(tosend!="FINISH"){
                                    tosend=IC.Response();
                                    dos.writeUTF(tosend); 
                                    }
                         break;
                         
                    case "ASSIGN":
                        IC.Request("ASSIGN");
                       
                      received="UPDATE Flight SET seat_avail=seat_avail-1 where flight_no='i01';"; 
                      // received=dis.readUTF();
                        System.out.println(received);
                        IC.Request(received);
                        
                        int n=0;
                        n=1; 
                          
                        IC.Request("1");
                        while(n-->0){
                            //received=dis.readUTF();
                            received="UPDATE seats SET s1=1 where flight_no='i01';";
                            IC.Request(received);    
                        }
                        
                        break;
                    
                    case "COMPLETE":
                        IC.Request("COMPLETE");
                        received="Insert into tickets(name,seats) values('prashant','1');";
                       // received=dis.readUTF();
                       // System.out.println(received);
                         IC.Request(received);
                         
                         String ticketno=IC.Response();
                         dos.writeUTF(ticketno); 
                        
                        
                                
                     break;           
                    default:
                        System.out.println("INVALID");
                       
                    
                }
               
            } catch (IOException e) { 
                e.printStackTrace(); 
            } 
         finally{
            try {
                this.dis.close(); 
                this.dos.close();
            } catch (IOException ex) {
                Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    } 
} 
