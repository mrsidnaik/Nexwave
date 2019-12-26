package assignment;

public class Organization {

	public static void main(String[] args) {
		
		Department HR = new Department("HR","Hyderabad");
		Department FD = new Department("FD","Hyderabad");
		Department TS = new Department("TS","Hyderabad");
		
		Address add1 = new Address(311, "Mindspace", "Hyderabad", "Telengana");
		Employee e1 = new Employee("Sid",add1,1,HR);
		Address add2 = new Address(312, "Mindspace", "Hyderabad", "Telengana");
		Employee e2 = new Employee("Avi",add2,1,HR);
		Address add3 = new Address(313, "Mindspace", "Hyderabad", "Telengana");
		Employee e3 = new Employee("Dev",add3,1,TS);
		Address add4 = new Address(314, "Mindspace", "Hyderabad", "Telengana");
		Employee e4 = new Employee("Roh",add4,1,TS);
		Address add5 = new Address(315, "Mindspace", "Hyderabad", "Telengana");
		Employee e6 = new Employee("Sach",add5,1);
		
		
	}

}
