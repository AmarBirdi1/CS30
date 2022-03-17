package vehicletest;

// Vehicle code for application

public abstract class Vehicle {
    int gas;
    int kilometers;
    String colour;
    
    public Vehicle(int gas, int kilo, String col){
        gas = gas;
        kilometers = kilo;
        colour = col;
    }
    
    public void fillGas(){
        gas += 20;
    }
    public double getKilo(){
       return kilometers;
    }
    public String getColour(){
        return ("The vehicle colour is going to be "+colour);
    }
    
    
}