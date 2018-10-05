import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {

	public static void main(String[] args) throws IOException {
		
		int clientCount = 0;
		
		ServerSocket serverSocket = new ServerSocket(1024);
		while(true) {
			Socket socket = null;
			try {
				socket = serverSocket.accept();
				System.out.println("Client Count: " + ++clientCount);
				DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
				DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
				System.out.println("Threaded Client #" + clientCount);
				Thread thread = new ClientHandler(socket, dataInputStream, dataOutputStream);
				thread.start();
			}catch (Exception e) {
				socket.close();
				e.printStackTrace();
			}
		}
		
	}

}
