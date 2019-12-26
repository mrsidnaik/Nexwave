package assignment;

public class Organization {

	static Employee[] emps = new Employee[5];
	static int limit =5;
	int counter =5;
	
	//public void addEmp(Employee e)
	//{
	//	if (counter< limit)
	//		emps[counter++]=e;
	//}
	
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
		Employee e5 = new Employee("Sach",add5,1, null);
		
		
		//org.addEmp(e1);
		//org.addEmp(e2);
		//org.addEmp(e3);
		//org.addEmp(e4);
		//org.addEmp(e5);
		emps[0]=e1;
		emps[1]=e2;
		emps[2]=e3;
		emps[3]=e4;
		emps[4]=e5;
		
		deptName(e1);
		deptList("HR");
		deptNull();
		
		
		
		
	}

	public static void deptName(Employee e)
	{
		System.out.println(e.getDept().getName());
	}
	
	public static void deptList(String dept)
	{
		for(int i = 0; i<5; i++)
		{
			Department d = emps[i].getDept();
			if(d != null)
			{
				String deptName = d.getName();
				if(deptName.equalsIgnoreCase(dept)) {
					System.out.println(emps[i]);
				}
			}
		}
	}
	
	public static void getDept(String name) {
		for (Employee e : emps) {
			if(e.getName().equalsIgnoreCase(name)) {
				System.out.println(e.getDept().getName());
		
			}
		}
	}
	
	
	public static void deptNull()
	{
		for(int i = 0; i<5; i++)
		{
			Department d = emps[i].getDept();
			if(d == null)
			{
					System.out.println(emps[i].getName());
				}
			}
		}
	}
	

