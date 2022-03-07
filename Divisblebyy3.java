

	
	// Create a Divisibleby3 application that prompts the user for an integer and then displays a message when check is clicked indicating whether the
// number is divisible by 3.



import javax.swing.*;
public class Divisblebyy3
{ 
public static void main(String args[]) {

String input1, input2; 
int integer, divisibleBy ; 
String cont="n";

do
{
	
input1 = JOptionPane.showInputDialog(null,"Enter a number: ");
integer=Integer.parseInt(input1);

input2 = JOptionPane.showInputDialog(null,"Is Divisible by ( Type 3 ): ");
divisibleBy=Integer.parseInt(input2);

if (integer % divisibleBy == 0 ){
JOptionPane.showMessageDialog(null,integer + " is divisible by " + divisibleBy );
} else {
JOptionPane.showMessageDialog(null,integer + " is not divisible by " + divisibleBy );
}

	
	cont =	JOptionPane.showInputDialog(null,"Try Again? (press y or n) ");
	}while (cont.matches("y"));
	JOptionPane.showMessageDialog(null,"Thank you!"  );
	}

}
	      	


