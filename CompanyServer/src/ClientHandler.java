package ui;

import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientHandler extends Thread {
	final DataInputStream dataInputStream;
	final DataOutputStream dataOutputStream;
	final Socket socket;
	final int Id;
	
	static volatile int count;

	static final String DB_URL = "jdbc:mysql://localhost:3306/indigo";
	static final String DB_DRV = "com.mysql.jdbc.Driver";
	static final String DB_USER = "root";
	static final String DB_PASSWD = "root";

	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;

	void searchFlights() throws IOException, SQLException {
		try {
			String abc = dataInputStream.readUTF();
			System.out.println(abc);
			resultSet = statement.executeQuery(abc);

			while (resultSet.next()) {

				String result = "";
				for (int i = 0; i < 10; i++) {
					System.out.printf("%s\t", resultSet.getString(i + 1));
					result = result + resultSet.getString(i + 1);
					result = result + " ";
				}
				System.out.println("");
				result = result + "END";
				dataOutputStream.writeUTF(result);
			}

			dataOutputStream.writeUTF("FINISH");
		} catch (SQLException ex) {
		} finally {
			resultSet.close();
			statement.close();
			connection.close();
		}
	}

	public ClientHandler(Socket socket, DataInputStream dataInputStream, DataOutputStream dataOutputStream, int Id)
			throws IOException {
		this.socket = socket;
		this.dataInputStream = dataInputStream;
		this.dataOutputStream = dataOutputStream;
		this.Id = Id;
		try {
			connection = (Connection) DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
			statement = (Statement) connection.createStatement();
			ResultSet rs = statement.executeQuery("SELECT max(ticket_id) FROM tickets;");
			rs.next();
			count = Integer.parseInt(rs.getString(1));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	void checkSeats() throws IOException, SQLException{
		try {
			String abc = dataInputStream.readUTF();
			System.out.println(abc);
			resultSet = statement.executeQuery(abc);
				resultSet.next();
				String result = "";
				for (int i = 1; i < 12; i++) {
					System.out.printf("%s ", resultSet.getString(i));
					result = result + resultSet.getString(i);
					result = result + " ";
				}
				System.out.println("");
				result = result + "END";
				dataOutputStream.writeUTF(result);
			
			dataOutputStream.writeUTF("FINISH");
		} catch (SQLException ex) {
		} finally {
			resultSet.close();
			statement.close();
			connection.close();
		}
	}
	
	void assignSeats() throws IOException, SQLException {
		String query = dataInputStream.readUTF();
		System.out.println(query);
		statement.executeUpdate(query);//flight table update
		int updateCount = Integer.parseInt(dataInputStream.readUTF());
		while(updateCount-- > 0) {
			query = dataInputStream.readUTF();
			System.out.println(query);
			statement.executeUpdate(query);
		}
	}
	
	void bookSeats() throws SQLException, IOException{
		String query = dataInputStream.readUTF();
		System.out.println(query);
		statement.executeUpdate(query);
		count++;
		dataOutputStream.writeUTF(Integer.toString(count));
		
	}

	void sayBye() throws IOException {
		dataOutputStream.writeUTF("BYEBYE");
	}

	public void run() {
		String recieved;
		String toReturn;
		try {
			dataOutputStream.writeUTF("ServerRead:ClientID " + Id);
			recieved = dataInputStream.readUTF();
			System.out.println(recieved);
			switch (recieved) {
			case "abc": {
				//System.out.println(recieved);
				//sayBye();
				 dataOutputStream.writeUTF("ABCC");
				break;
			}
			case "SEARCHFLIGHTS":{
				//dataOutputStream.writeUTF("HH");
				System.out.println("Reached Search");
				searchFlights();
				break;
			}
			case "Hi": {
				System.out.println(recieved);
				sayBye();
				// dataOutputStream.writeUTF("BYE");
				break;
			}
			case "CHECKSEATS":{
				System.out.println(recieved);
				checkSeats();
				break;
			}
			case "ASSIGN":{
				assignSeats();
				break;
			}
			case "COMPLETE":{
				bookSeats();
				break;
			}
			default: {
				dataOutputStream.writeUTF("Default");
			}
			// automate conversation
			}
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}

	}

}
