import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler extends Thread {
	final DataInputStream dataInputStream;
	final DataOutputStream dataOutputStream;
	final Socket socket;

	public ClientHandler(Socket socket, DataInputStream dataInputStream, DataOutputStream dataOutputStream) {
		this.socket = socket;
		this.dataInputStream = dataInputStream;
		this.dataOutputStream = dataOutputStream;
	}

	public void run() {
		String recieved;
		String toReturn;
		while (true) {
			try {
				dataOutputStream.writeUTF("Hello from Server");
				recieved = dataInputStream.readUTF();
				if (recieved.equals("BYE")) {
					System.out.println("Client says BYE\nClosing Connection");
					this.socket.close();
					System.out.println("Connection Closed");
					break;
				}
				// automate conversation
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
