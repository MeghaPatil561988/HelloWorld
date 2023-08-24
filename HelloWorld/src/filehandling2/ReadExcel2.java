package filehandling2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;





public class ReadExcel2
{
	 public static void main(String[] args) throws Exception 
	 {
	String filePath = "C:\\Users\\Megha\\eclipse-workspace\\HelloWorld\\practise.xlsx";    
    
	 String driverClassName = "com.mysql.jdbc.Driver";
     String url = "jdbc:mysql://localhost:3306/selenium_part1";
     String userName = "root";
     String password = "root";
     
     //Step1: Load the Driver class
     Class.forName(driverClassName);
     
     //Step2: Get Connection object using DriverManager class
     Connection con = DriverManager.getConnection(url, userName, password);
     
     //Step3: Create a PreparedStatement object and execute your sql query
     String sql = "select * from employee";
     PreparedStatement pst = con.prepareStatement(sql);
     ResultSet rs = pst.executeQuery();
     while(rs.next()) 
     {
         String employeeId = rs.getString("employee_id");
         String employeeName = rs.getString("employee_name");
         String emailId = rs.getString("email");
         System.out.println("employeeId:"+employeeId);
         System.out.println("employeeName:"+employeeName);
         System.out.println("emailId:"+emailId);
         System.out.println("*************************");
     }
 }
    
    
}

