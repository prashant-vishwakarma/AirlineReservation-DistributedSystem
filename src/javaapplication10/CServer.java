/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.io.IOException;
import java.net.ServerSocket;

/**
 *
 * @author hp
 */
public class CServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        System.out.println("company server running");
        ServerSocket listener = new ServerSocket(1024);
        
                 

        try {
            while (true) {
                new connect(listener.accept()).start();
            }
        } finally {
            listener.close();
        }

    }
    
}
