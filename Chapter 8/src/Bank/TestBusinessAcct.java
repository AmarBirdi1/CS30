package Bank;



// Main class to test business account

public class TestBusinessAcct {

	public static void main (String[] args) {

	

		BusinessAcct acct = new BusinessAcct(590.00);

		System.out.println("Account balance: " + acct.toString());

		

		System.out.println("Withdrawing $CAD 200 : ");

		System.out.println("$ 10 will be charged as account balance is below $500: ");

		acct.withdrawal(200);

		System.out.println("Account balance: " + acct.toString());



	}

}