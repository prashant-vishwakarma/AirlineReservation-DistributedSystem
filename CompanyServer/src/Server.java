package ui;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	static final int PORT = 1024;

	public static void main(String[] args) throws IOException {

		int clientCount = 0;
		int ClientId = 0;

		@SuppressWarnings("resource")
		ServerSocket serverSocket = new ServerSocket(PORT);
		while (true) {
			Socket socket = null;
			try {
				socket = serverSocket.accept();
				System.out.println("Client Count: " + ++clientCount);
				ClientId = 1000 + clientCount;
				DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
				DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
				System.out.println("Threaded Client #" + clientCount);
				Thread thread = new ClientHandler(socket, dataInputStream, dataOutputStream, ClientId);
				thread.start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
