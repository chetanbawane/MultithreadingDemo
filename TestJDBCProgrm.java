package packageJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestJDBCProgrm {

	public static void main(String[] args) {
		
		Connection con= null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String jdbcurl="jdbc:mysql://localhost:3306/DAC";
			
			con= DriverManager.getConnection(jdbcurl,"root","root");
			System.out.println("connection done");
		Statement statement= con.createStatement();
		String sqlquery= "select EMPNO, ENAME from emp";
		
		ResultSet resultSet= statement.executeQuery(sqlquery);
		
		while (resultSet.next()) {
			System.out.println(resultSet.getString("EMPNO")+"  "+ resultSet.getString("ENAME"));
			
		}
			
		} catch (Exception e) {
			
			System.out.println("found error");		}
	}

}
