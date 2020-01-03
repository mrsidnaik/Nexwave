package jdbc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	private int id;
	private String name;
	private int deptid;
	private Date joinDate;
	private int salary;
	public Employee(int id, String name, int deptid, Date joinDate, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.deptid = deptid;
		this.joinDate = joinDate;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
		String sdate =sdf.format(joinDate);
		return "Employee [id=" + id + ", name=" + name + ", deptid=" + deptid + ", joinDate=" + sdate + ", salary="
				+ salary + "]";
	}

}
