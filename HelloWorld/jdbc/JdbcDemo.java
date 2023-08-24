import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcDemo 
{
	 public static void main(String[] args) throws ClassNotFoundException, SQLException
	 {
		 String driverClassName="com.mysql.jdbc.Driver";
		 String url = "jdbc:mysql://localhost:3306/";
		 String username="";
		 String password="";
		 
		 Class.forName(driverClassName);
		 Connection con = DriverManager.getConnection(url,username, password);
		 String sql
		 
		 
	 }
}
