package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBReader {
	

	public static void main(String[] args) {
		Connection con =null;
		// TODO Auto-generated method stub
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	} catch 
	(ClassNotFoundException e) {
		System.out.println("Driver not found");
	}
	
	String url ="jdbc:oracle:thin:@localhost:1521:orcl";
	String username = "hr";
	String password = "hr";
	try {
		con = DriverManager.getConnection(url,username,password);
	}catch (SQLException e) {
		System.out.println("Connection failed. "+e.getMessage());
	}
	
	String sql = "select * from departments";
	try {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		int ctr=0;
		while(rs.next()) {
			String fname = rs.getString("department_name");
			System.out.println(fname);
			ctr++;
		}
		System.out.println(ctr);
		rs.close();
		st.close();
		con.close();
	} catch(SQLException sqle) {
		System.out.println(sqle.getMessage());
	}
	
	}

}
