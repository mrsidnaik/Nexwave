package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;



public class Test {
	
	static List<Employee> employee = new ArrayList<>();
	Connection con = null;
	public void listEmployeesBeforeDate(String date) {
		int ctr =0;
		DBConnector connector =new DBConnector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		con = connector.getConnection();
		String sql = "select employee_id, first_name||' '||last_name, department_id, to_char( hire_date, 'DD-MON-YYYY') as hiredate, salary from employees where hire_date<?";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, date);
			ResultSet rs =pst.executeQuery();
			while(rs.next()) {
//				System.out.println(rs.getString(1)+":"+rs.getString(2));
				ctr++;
				int id =rs.getInt(1);
				String name = rs.getString(2);
				int deptId =rs.getInt(3);
				String dates =rs.getString(4);
				int salary =rs.getInt(5);
				SimpleDateFormat sdf = new SimpleDateFormat("DD-MMM-YYYY");
				Date jdate = null;
				try {
					jdate = sdf.parse(dates);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Employee e = new Employee(id,name,deptId,jdate,salary);
				employee.add(e); 
			}
			
		}catch (SQLException e) {
			System.out.println(e);
		}
		System.out.println(ctr);
	}


	public static void main(String[] args) {
		new Test().listEmployeesBeforeDate("01-JAN-10");
		
		Iterator<Employee> emp = employee.iterator();
		while(emp.hasNext()) {
			Employee e = emp.next();
			System.out.println(e.toString());
			}
		
		
		
	}

}
