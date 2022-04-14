package Rosters;



// StudentRoster

	import java.util.Scanner;
	public class Roster{
		public static void main(String[] args)
		{
			Scanner input =new Scanner(System.in);
			System.out.print("Enter the  number of students:");
			int number_of_student=input.nextInt();
			String[] student=new String[number_of_student];
			input.nextLine();
			
			for(int x=0; x<number_of_student; x++)
			{
				System.out.print("Enter a student name:");
				student[x]=input.nextLine();
			}
			
			System.out.println(" the Student Roster is :");
			for(int x=0; x<number_of_student; x++)
			{
				System.out.println(student[x]);
			}
		}
	}
	

