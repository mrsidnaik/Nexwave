package core;

public class CurrentAccount extends Account {

	public CurrentAccount(String name, long number, double balance) {
		super(name, number, balance);
		System.out.println();
	}
	
	@Override
	public void withdraw(double amount)
	{
		if(balance>amount)
			{
			balance-=amount;
			}
	}
}
	

