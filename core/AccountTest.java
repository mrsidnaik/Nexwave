package core;

public class AccountTest {
	public static void showBalance(Account ac)
	{
		System.out.println(ac.getBalance());
	}
	
	public static void printAccount(Account ac, Printer p)
	{
		ac.print("from account");
		p.print("From Printer class");
	}

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount("Neha",123,100000);
		System.out.println(sa);
		sa.withdraw(4000);
		System.out.println(sa);
		CurrentAccount ca = new CurrentAccount("Riya", 456, 20000);
		ca.withdraw(50000);
		System.out.println(ca);
		Account ac = new SavingsAccount("Amit",789,100000);
		System.out.println(ac);
		ac.withdraw(50000);
		System.out.println(ac);
		showBalance(sa);
		
		ac.print("Hello");
		sa.print("From Savings");
		ac.print("World");
		
		printAccount(ac, new ConsolePrinter());
		printAccount(ac, new FilePrinter());
	}

}
