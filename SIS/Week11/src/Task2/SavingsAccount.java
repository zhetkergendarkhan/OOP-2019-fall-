package Task2;

public class SavingsAccount extends Account{

	private int interestRate;
	
	public SavingsAccount(int a, int interestRate) {
		super(a);
		this.interestRate = interestRate;
	}
	
	public void addInterest() {
		this.deposit(getBalance()*(1+interestRate/100));
	}
}
