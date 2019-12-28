package Assesment;

import Assesment.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Assesment.Department;


public class Test {
	
	static List<Employee> employee = new ArrayList<>();
	
	
	public static void showEmpAll()
	{
		Iterator<Employee> emp = employee.iterator();
		while(emp.hasNext()) {
			Employee e = emp.next();
			System.out.println(e.toString());
		}
	}
	
	
	public static void showEmpOnDept(Department dept)
	{
		Iterator<Employee> emp = employee.iterator();
		while(emp.hasNext()) {
			Employee e = emp.next();
			if(dept.getName().equals(e.getDept().getName()))
				System.out.println(e.toString());
		}
		
	}
	
	public static void showEmpOnRole(String role)
	{
		Iterator<Employee> emp = employee.iterator();
		while(emp.hasNext()) {
			Employee e = emp.next();
			if(e.getRole().equals(role))
				System.out.println(e.toString());
		}
	}
	
	public static void salaryIncrement(String role, int incr)
	{
		Iterator<Employee> emp = employee.iterator();
		while(emp.hasNext()) {
			Employee e = emp.next();
			if(e.getRole().equals(role))
				{
				e.setFlag(true);
				e.setSalary(e.getSalary()+(0.01*incr*e.getSalary()));
				System.out.println(e.toString());
				}
		}
	}
		
		
	public static void showEmpWithIncre()
	{
		Iterator<Employee> emp = employee.iterator();
		while(emp.hasNext()) {
			Employee e = emp.next();
			if(e.getFlag() == true)
				{
				System.out.println(e.toString());
				}
				
		}	
	}
	
	public static void showEmpUnderManager(String name)
	{
		Iterator<Employee> emp = employee.iterator();
		while(emp.hasNext()) {
			Employee e = emp.next();
			if(e.getManager() != null)
				{
					if (e.getManager().getName().equals(name))
				
						System.out.println(e.toString());
				}
			}
	}

	public static void main(String[] args) {
		Department MAN = new Department("MAN", "Hyderabd");
		Department DEV = new Department("DEV","Delhi");
		Department TES = new Department("TES","Mumbai");
		
		Employee e1 = new Employee("Sid",12,3008.90,"Manager",MAN,null);
		Employee e2 = new Employee("Avi",1,29830.90,"Developer",DEV,e1);
		Employee e3 = new Employee("Dev",16,30083.90,"Tester",TES,e1);
		Employee e4 = new Employee("Sam",2,30085.90,"Manager",MAN,null);
		Employee e5 = new Employee("Tkr",27,3694.90,"Developer",DEV,e4);
		Employee e6 = new Employee("Sach",17,53008.90,"Developer",DEV,e4);
		Employee e7 = new Employee("Sat",12,3008.90,"Tester",TES,e4);
		
	
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		employee.add(e4);
		employee.add(e5);
		employee.add(e6);
		employee.add(e7);
		
		
		showEmpAll();
		showEmpOnDept(MAN);
		showEmpOnRole("Tester");
		salaryIncrement("Tester",10);
		showEmpWithIncre();
		showEmpUnderManager("Sam");
		
	}

}
