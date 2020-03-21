package Task2;

public class CheckingAccount extends Account{

	private int numberOfTransactions;
	private int freeTransactions;
	private final double charge = 0.02;
	
	public CheckingAccount(int a, int numberOfTransactions) {
		super(a);
		this.numberOfTransactions = numberOfTransactions;
		this.freeTransactions = 2;
	}

	public void deductFee() {
		if (this.freeTransactions > this.numberOfTransactions)
			return;
		this.withdraw((numberOfTransactions - freeTransactions) * charge);
	}
}
