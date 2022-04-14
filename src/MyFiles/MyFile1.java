package MyFiles;


// Myfile part 1
	
	import java.io.*;
	
	public class MyFile1 {
		
	public static void main(String[] args) {
		
	File textFile = new File("c:\supplies.txt");
	if (textFile.exists()) {
	System.out.println("The file already exists.");
	} else {
	try {
	textFile.createNewFile();
	System.out.println("The new file has been created.");
	} catch (IOException e) {
	System.out.println("File could not be created.");
	System.err.println("IOException: " + e.getMessage());
	}
	}
	}
	
}
