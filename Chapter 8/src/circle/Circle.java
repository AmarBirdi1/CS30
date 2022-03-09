package circle;



//Circle class for Puck's

public class Circle {
    private static double PI = 3.14;
    private double radius;
  
    public Circle() {
        radius = 1;
    }
  
    public Circle(double r) {
        radius = r;
    }
   
    public double area() {
        double area;
        area = radius * radius * PI;
        return(area);
    }
   public double getRadius() {
       return(radius);
   }
 
    public String toString() {
        String circleString;
      
        circleString = "Circle has a radius of " + radius;
        return(circleString);
    }
  

}