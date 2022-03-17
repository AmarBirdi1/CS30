package vehicletest;


// Minivan for Vehicle application

public class Minivan extends Vehicle{
    int numPeeps;
    String activity;
    
    public Minivan(int g, int k, String c, int peeps, String purpose){
        super(g, k, c);
        numPeeps = peeps;
        activity = purpose;
    }
    public int returnCapacity(){
        return numPeeps;
    }
    public String whatActivity(){
        return activity;
    }
    public String toString(){
        return("The van has "+numPeeps+" passengers and is going to  "+activity);
    }
    public void setActivity(String newAct){
        activity = newAct;
    }
    public void setPassengers(int newPas){
        numPeeps = newPas;
    }
}