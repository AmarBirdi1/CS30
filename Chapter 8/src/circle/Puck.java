package circle;

// Puck part 2 of 2

	
	public class Puck extends Disk {
		 public double minStdWeight = 5;
		 public double maxStdWeight = 5.5;
		 public double minYthWeight = 4;
		 public double maxYthWeight = 4.5;
		 private double weight;
		 private boolean standard, youth; 
		 
		 
		
		 public Puck(double t, double w) {
		 super(1.5, 1);
		 weight = w;
		 if (weight >= minStdWeight && weight <= maxStdWeight) {
		 standard = true;
		 youth = false;
		 } else {
		 youth = true;
		 standard = false;
		 }
		 } //
		 
		
		 
		 // Return weight
		 public double getWeight() {
		 return(weight);
		 }
		 
		
		 public String getDivision() {
		 String div;
		 
		 
		 if (standard) {
		 div = " The Puck is standard";
		 } else {
		 div = " The Puck is youth";
		 }
		 return(div);
		 }

		
		 public boolean equales(Object obj) {
		 Puck testObj = (Puck)obj;
		 
		 if(testObj.getDivision() == getDivision()) {
		 return(true);
		 } else {
		 return(false);
		 }
		 }
		 
		 
		 
		 
		 public String toString() {
		 String puckString;
		 
		 puckString = "The puck has a weight of " + getWeight() + " and division of " + getDivision() + ".";
		 return(puckString);
		 }
		
}
