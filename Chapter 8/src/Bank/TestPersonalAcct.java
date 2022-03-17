package Bank;



// Main class to test personal account



public class TestPersonalAcct {

	public static void main (String[] args) {

	

		PersonalAcct acct = new PersonalAcct(335.00);

		System.out.println("Account balance: " + acct.toString());

		

		System.out.println("Withdrawing $CAD 250 : ");

		System.out.println("$ 2 is being charged as account balance is below $100: ");

		acct.withdrawal(250);

		System.out.println("Account balance: " + acct.toString());



	}

}