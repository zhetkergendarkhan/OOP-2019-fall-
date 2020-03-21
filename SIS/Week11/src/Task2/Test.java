package Task2;

import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		Account acc1 = new Account(123);
		Account acc2 = new CheckingAccount(0012, 5);
		Account acc3 = new SavingsAccount(6432, 12);
		Vector<Account> accounts = new Vector<Account>();
		accounts.add(acc1);
		accounts.add(acc2);
		accounts.add(acc3);
		Bank bank = new Bank(accounts);
		bank.update();
		for (Account acc : accounts) {
			System.out.println("Updated Balance:" + acc.getBalance());
		}
	}

}
