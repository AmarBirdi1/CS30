package Bank;



// Business account class

public class BusinessAcct extends Account {

	private double MIN = 500;



	public BusinessAcct(double bal) {

		super(bal);



	}



	public void withdrawal(double amt) {

		

		double balance = getBalance();



		if (amt <= balance) {

			

			super.withdrawal(amt);



			
			if (getBalance() < MIN) {

				super.withdrawal(10.00);

			}

		} else {

			System.out.println("Not enough .");

		}

	}



	public boolean equals(BusinessAcct p) {



		if (p.getBalance() == super.getBalance()) {

			return (true);

		} else {

			return (false);

		}

	}



	public String toString() {

		String businessacctString;



		businessacctString = "The balance is " + super.getBalance();

		return (businessacctString);

	}

}