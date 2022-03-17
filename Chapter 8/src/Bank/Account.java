package Bank;

import java.text.NumberFormat;

// Account class

public class Account {

	private double balance;



	

	public Account(double bal) {

		balance = bal;



	}



	

	public double getBalance() {

		return (balance);

	}



	

	public void deposit(double amt) {

		balance += amt;

	}



	

	public void withdrawal(double amt) {

		if (amt <= balance) {

			balance -= amt;

		} else {

			System.out.println("Not enough money in account.");

		}

	}




	public String toString() {

		String accountString;

		NumberFormat money = NumberFormat.getCurrencyInstance();



		accountString = "Current balance is " + money.format(balance);

		return (accountString);

	}

}