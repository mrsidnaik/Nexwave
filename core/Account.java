package core;

public abstract class Account implements Printer{
	protected String name;
	protected long number;
	protected double balance;
	
	
	public Account(String name, long number, double balance) {
		super();
		this.name = name;
		this.number = number;
		this.balance = balance;
	}
	
	public void print(String s)
	{
		System.out.println("Printing account info...");
	}
	
	public abstract void withdraw(double amount);
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	@Override
	public String toString() {
		return "Account [name=" + name + ", number=" + number + ", balance=" + balance + "]";
	}
	
	
	
	
	
	

}
