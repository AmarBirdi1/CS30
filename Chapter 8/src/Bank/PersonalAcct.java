package Bank;



// Personal account class

public class PersonalAcct extends Account {

	private double MIN = 100;



	public PersonalAcct(double bal) {

		super(bal);



	}



	public void withdrawal(double amt) {

		double balance = getBalance();



		if (amt <= balance) {

		

			super.withdrawal(amt);



			

			if (getBalance() < MIN) {

				super.withdrawal(2.00);

			}

		} else {

			System.out.println("Not enough.");

		}

	}



	public boolean equals(PersonalAcct p) {



		if (p.getBalance() == super.getBalance()) {

			return (true);

		} else {

			return (false);

		}

	}



	public String toString() {

		String personacctString;



		personacctString = "The balance is " + super.getBalance();

		return (personacctString);

	}

}