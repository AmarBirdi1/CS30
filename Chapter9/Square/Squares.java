package Square;



// Create a squares application that stores the square of an elements index in an integer array of 5 elements. For example, the third
// element, which has index 2, should store 4. The application should then display the value of each element in the array

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Squares {

	public static void main(String[] args)
	{
	 
	  List<Double> array = new ArrayList<>();
	  
		ArrayList<Integer> MySquare = new ArrayList<Integer>();
		MySquare.add(1);
		
		MySquare.add(2);
		
		MySquare.add(3);
		
		MySquare.add(4);
	

	  
	  for (int i = 0; i < 5; ++i) {
	    array.add(i, Math.pow(i, 2));
	  }

	
	  for (int i = 0; i < array.size(); ++i) {
	    System.out.println(String.format("%2d\t%3.0f", i, array.get(i)));
	  }
	}


}