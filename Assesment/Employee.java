package Assesment;


public class Employee {
	
	private String name;
	private int id;
	private double salary;
	private String role;
	private Department dept;
	private Employee manager;
	private boolean flag;
	

	public Employee(String name, int id, double salary, String role, Department dept, Employee manager) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.role = role;
		this.dept = dept;
		this.manager = manager;
		flag= false;
	}
	

	public boolean getFlag() {
		return flag;
	}


	public void setFlag(boolean flag) {
		this.flag = flag;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", role=" + role + ", dept=" + dept
				+ ", manager=" + manager + ", flag=" + flag + "]";
	}

	





	


}
