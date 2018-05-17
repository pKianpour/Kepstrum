import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
	
	public static void main(String[] args) throws Exception {
		createTable();
	}
	
	public static void createTable() throws Exception {
		try {
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS revision_log (REVISION_ID int(10) NOT NULL, DATE VARCHAR(10) NOT NULL, PROJECT_LEAD VARCHAR(25) NOT NULL, CATEGORY VARCHAR(25) NOT NULL, DESCRIPTION VARCHAR(45) NOT NULL, CODE INT(10) NOT NULL, PRIMARY KEY(REVISION_ID)");
			create.executeUpdate();
		} catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Function complete.");
		}
	}
	
	public static Connection getConnection() throws Exception {
		try {
			String driver = "com.mysql.jdbc.Driver";
			//If not using local host, use IP address of server to connect to instead
			String url = "jdbc:mysql://localhost:3306/";
			String username = "root";
			String password = "root1";
			Class.forName(driver);
			
			Connection conn = (Connection)DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
			return conn;
		} catch(Exception e) {
			System.out.println(e);
		}
		
		
		return null;
	}
	
}
