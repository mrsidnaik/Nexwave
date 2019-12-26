package core;

public class SavingsAccount extends Account {
	private static final double MINIMUM = 10000;
	
	public SavingsAccount(String name, int number, double balance) {
		super(name,number,balance);
	}
	@Override
	public void withdraw(double amount)
	{
		if (balance>amount)
		{
			if ((balance-amount)>=MINIMUM)
				balance -= amount;
		}
	}
	@Override
	public void print(String s)
	{
		System.out.println(s);
	}
}
