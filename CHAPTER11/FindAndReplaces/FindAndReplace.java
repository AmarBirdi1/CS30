package FindAndReplaces;



// FindAndReplace Application

	
	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Scanner;
	public class FindAndReplace {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        
	        System.out.println("What is the search word or phrase ?");
	        
	        String search = input.nextLine();
	        
	        System.out.println("What is the replacement word?");
	        
	        String replacementWord = input.nextLine();
	        
	        System.out.println("Please enetr the source file");
	        
	        String source = input.nextLine();
	        
	        System.out.println("Please enetr your destination file");
	        
	        String destination = input.nextLine();
	        
	        
	        
	        input.close();
	        try {
	            FileWriter fileOut = new FileWriter(destination);
	            BufferedWriter bw = new BufferedWriter(fileOut);
	            Scanner fileRead = new Scanner(new File(source));
	            while (fileRead.hasNextLine()) {
	                String data = fileRead.nextLine();
	                bw.write(data.replace(search, replacementWord));
	                bw.newLine();
	                
	                
	            }
	            bw.flush();
	            bw.close();
	            fileRead.close();
	            System.out.println("Data has been replaced successfully.");
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}
	

