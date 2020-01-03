package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;



public class UserDAO {
	
	 ArrayList<Users> userList= new ArrayList<>();
	 Connection con;
	
	public Roles getRole(int role_id)
	{
		DBConnector connector =new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		con = connector.getConnection();
		String sql = "select * from roles where id="+role_id;
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs =pst.executeQuery(sql);
			while(rs.next()) {
				Roles r =new Roles(rs.getInt(1),rs.getString(2),rs.getString(3));
				return r;
			}
			
		}catch (SQLException e) {
			System.out.println(e);
		}
		return null;
	}
		

	public void listUsers() {
		DBConnector connector =new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		con = connector.getConnection();
		String sql = "select * from users";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs =pst.executeQuery(sql);
			while(rs.next()) {
				Users u = new Users(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),getRole(rs.getInt(6)),rs.getString(7));            
				userList.add(u);
			}
			
		}catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	
	public void getUsers()
	{
		Iterator<Users> usr = userList.iterator();
		while(usr.hasNext()) {
			Users u = usr.next();
			System.out.println(u.toString());
		}
	}
	
	public void getUserRole(String Name)
	{
		Iterator<Users> usr = userList.iterator();
		while(usr.hasNext()) {
			Users u = usr.next();
			if(u.getName().equalsIgnoreCase(Name))
			{
				System.out.println(u.getRole().getName());
			}
					
		}

	}

	public static void main(String[] args) {
		UserDAO d= new UserDAO();
		d.listUsers();
		d.getUsers();
		d.getUserRole("Green");
	}

}
