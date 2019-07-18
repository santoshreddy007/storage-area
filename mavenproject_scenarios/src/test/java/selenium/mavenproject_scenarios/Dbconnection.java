package selenium.mavenproject_scenarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Dbconnection {
	 WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    String dburl="jdbc:mysql://localhost:3306/seleniumsoftwares";
    String username="root";
    String password="San@1234";
    Connection conn=DriverManager.getConnection(dburl,username,password);
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Desc EmpList");
    Thread.sleep(10000);
    while(rs.next());
    System.out.println("EmpList Id:"+rs.getInt("EmpList Id"));
    System.out.println("EmpList Name:"+rs.getString("EmpList Name"));
    
	}
   //conn.close();
	} 
	





