package compare;

public class EmployeeTest {

	public static void main(String[] args) {
			Employee e1 = new Employee("Akhil",123);
			Employee e2 = new Employee("Akhil",123);
			System.out.println(e1.equals(e2));
	}

}
