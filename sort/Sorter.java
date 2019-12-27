package sort;
import java.util.Arrays;
import compare.Employee;
import java.util.Comparator;

public class Sorter {

	public static void main(String[] args) {
		String s0 = "Apple";
		String s1 = "Aadvark";
		String s2 = "Ball";
		String[] arr = new String[3];
		arr[0]=s0;
		arr[1]=s1;
		arr[2]=s2;
		System.out.println(s1.compareTo(s2));
		Arrays.sort(arr);
		for(int i =0; i<3;++i)
		{
			System.out.println(arr[i]);
		}
		
		Employee e1 = new Employee("Sid",13);
		Employee e2 = new Employee("Sam",70);
		
		Employee emps[]= new Employee[2];
		emps[0] =e1;
		emps[1] = e2;
		
		//Arrays.sort(emps, new Compartor<Employee>()
		//		{
		//			public int compare(Employee e1, Employee e2)
		//			{
			//			return e2.getName().compareToIgnoreCase(e2.getName());
			//		}
		//		});
		
		Arrays.sort(emps, new Comparator<Employee>()
		{
			public int compare(Employee e1, Employee e2)
			{
				return e1.getId()-e2.getId();
			}
		});

		
		
		for(Employee e : emps)
		{
			System.out.println(e);
		}
	}

}
