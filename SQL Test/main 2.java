import java.sql.Connection;
import java.sql.DriverManager;

//import com.mysql.jdbc.Connection;

public class main {
	
	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3307/revisionlog", "root", "root1");
			
			if(conn!=null)
				System.out.println("Connected");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
