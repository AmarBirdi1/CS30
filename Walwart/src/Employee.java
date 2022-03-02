
public abstract class Employee {

	
	private String firstName;
	private String lastName;
	
	public Employee(String fn, String ln)//constructor method

	{
		firstName = fn;
		lastName = ln;
	}
	
	public String toString()// prints employee object
	
	{
		
		return(firstName + " " + lastName);
		
	}
	
	abstract double pay(double period);
	
	
}
