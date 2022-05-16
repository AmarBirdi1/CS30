package FindNames;

import java.util.Scanner;
import java.util.Random;



// FindName application

public class FindName {

public static void main(String[] args) {
final int MAX = 15;
int[] numArray = new int[MAX];
Random rand = new Random();

Scanner input = new Scanner(System.in);

int num, location;
for (int i = 0; i < numArray.length;i ++) {
numArray[i] = rand.nextInt(MAX);

}

System.out.print(" Please Enter number between 0 and " + MAX

+ ": ");

num = input.nextInt();
location=-1;

for(int i=0;i<numArray.length;i++){
	if(numArray[i]==num)
		location=i;
}

if (location == -1) {

System.out.println("The number was not found.");

} else {

System.out.println(" The element is "

+ location);
}

final int max_name=3;
String[] namesArr=new String[max_name];
System.out.println("Please enetr 3 names :");
input.nextLine();
for(int j=0;j<max_name;j++)
namesArr[j]=input.nextLine();

System.out.println("What name would you like to find : ");
String name=input.nextLine();

int loc=Search.linear(namesArr,name);

if (loc == -1) {

System.out.println("The name was not found.");

} else {

System.out.println("The element is "

+ loc);
}

}

}
