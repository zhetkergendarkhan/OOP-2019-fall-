package Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class Bank {
	private Vector<Account> accounts;
	
	public Bank (Vector<Account> accounts) {
		this.accounts = accounts;
	}
	
	public void update() {
		for(Account acc : accounts) {
			if (acc instanceof SavingsAccount) {
				SavingsAccount sa = (SavingsAccount)acc;
				manipulate(acc);
				sa.addInterest();
			}
			else if (acc instanceof CheckingAccount) {
				CheckingAccount ca = (CheckingAccount)acc;
				manipulate(acc);
				ca.deductFee();
			}
			else {
				manipulate(acc);
			}
		}
		
	}
	
	public void manipulate(Account acc) {
		System.out.println("Would you like to deposit or withdraw?");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String temp = null;
		try {
			temp = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		double sum = 0;
		if (temp.equals("Deposit")) {
			
			try {
				sum = reader.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			acc.deposit(sum);
			
		}
		else if (temp.equals("Withdraw")) {
			try {
				sum = reader.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			acc.withdraw(sum);
		}
	
	}
	
	public void openAccount(Account acc) {
		accounts.add(acc);
	}
	
	public void closeAccount(Account acc) {
		accounts.remove(acc);
	}
}
