
public class Manager extends Employee
{

	double yearlySalary;
	
	public  Manager(String fn, String ln, double sal)
	{
		
		super(fn, ln);
		yearlySalary = sal;
		
	}
	

	
	public double pay(double weeks)
	{
		
		double payEarned;
		payEarned = yearlySalary/52*weeks;
				return payEarned;
		
	}
	
	public String toString()// prints manager object
	{
		return(super.toString() + ", manager" + "Salary:" + yearlySalary );
		
	}
	
}
