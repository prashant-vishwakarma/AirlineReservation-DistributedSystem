package ui;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		
		int clientCount = 0;
		int ClientId = 0;
		
		ServerSocket serverSocket = new ServerSocket(1024);
		while(true) {
			Socket socket = null;
			try {
				socket = serverSocket.accept();
				System.out.println("Client Count: " + ++clientCount);
				ClientId = 1000 + clientCount;
				DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
				DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
				ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
				System.out.println("Threaded Client #" + clientCount);
				Thread thread = new ClientHandler(socket, dataInputStream, dataOutputStream, objectInputStream, objectOutputStream, ClientId);
				thread.start();
			}catch (Exception e) {
				socket.close();
				e.printStackTrace();
			}
		}
		
	}

}
