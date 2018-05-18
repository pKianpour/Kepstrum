
import java.sql.DriverManager;
import java.sql.*;
import java.sql.SQLException;


//import com.mysql.jdbc.Connection;

public class test {
	

	public static void establishJDBC() throws ClassNotFoundException {
		
		// New connection
		java.sql.Connection connection = null;
		
		try {
			// access driver from jar file
			Class.forName("com.mysql.cj.jdbc.Driver");
			String connectionURL = "jdbc:mysql://localhost:3306/revisionlog?autoReconnect=true&useSSL=false";
			connection = DriverManager.getConnection(connectionURL, "root", "root1");
			
			String query = "SELECT * FROM revisionlog.revisionlog";
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(query);

		//	Statement statement = connection.createStatement();
			
		//	statement.executeUpdate("SELECT * FROM revisionlog.revisionlog");
			while (result.next()) {
				System.out.println(result.getInt("REVISION_ID")); 	
			}
			connection.close();
			
			
		
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			establishJDBC();	

		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}