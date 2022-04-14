package Rosters;



	//import the required packages

	import java.io.Serializable;

	//define the class StuName

	public class StuName implements Serializable

	{

	//declare the class members

	public String firstName;

	public String lastName;

	//override the toString()

	public String toString()

	{

	//return the name of the student

	return firstName + " " + lastName;

	}

	}
	

