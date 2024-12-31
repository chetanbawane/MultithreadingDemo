package packageJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.cj.PreparedQuery;

public class UpdateEmpData {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String jdbcurl="jdbc:mysql://localhost:3306/DAC";
			
			Connection con=DriverManager.getConnection(jdbcurl,"root","root");
			System.out.println("connection established");
		
			PreparedStatement pstat= con.prepareStatement("UPDATE emp set email= ? where ename=?");
			pstat.setString(1,"james@123");
			pstat.setString(2,"JAMES");
			int result= pstat.executeUpdate();
		
		System.out.println(result);

	}
    

}