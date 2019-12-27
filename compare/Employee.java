package compare;

import java.util.Comparator;

public class Employee implements Comparable<Employee>, Comparator<Employee>{
	private String name;
	private int id;
	
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
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
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
	@Override
	public boolean equals(Object o)
	{
		Employee e = (Employee)o;
		return this.id==e.id;
	}

	@Override
	public int compareTo(Employee other) {
		
		return this.name.compareTo(other.name);
	}

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);
	}
	
	

}
