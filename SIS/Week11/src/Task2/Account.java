package Task2;

public class Account {
	private double balance;
	private int accNumber;
	
	public Account (int a) {
		balance = 0.0;
		accNumber = a;
	}
	
	public void deposit(double sum) {
		balance = balance + sum;
	}
	
	public void withdraw(double sum) {
		balance = balance - sum;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getAccountNumber() {
		return accNumber;
	}
	
	public void transfer(double amount, Account other) {
		if (this.balance < amount) {
			System.out.println("Not enough money to transfer");
			return;
		}
		this.withdraw(amount);
		other.deposit(amount);
	}
	
	public String toString() {
		return "Account number is " + accNumber + " with balance " + balance;
	}
	
	public final void print() {
		System.out.println(toString());
	}
	
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Account))
			return false;
		Account acc = (Account)o;
		if (this.balance!=acc.balance)
			return false;
		if (this.accNumber!=acc.accNumber)
			return false;
		return true;
	}
}
