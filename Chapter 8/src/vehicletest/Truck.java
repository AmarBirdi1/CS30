package vehicletest;


// Truck for Vehicle application

public class Truck extends Vehicle{
    String cargo;
    int cargoWeight;
    public Truck(int g, int k, String c,String carg,int cargWeight){
        super(g, k, c);
        cargo = carg;
        cargoWeight = cargWeight;
   }
    
    
    public String getCargo(){
        return ("The truck is carrying this cargo: "+cargo);
    }
    public int getWeight(){
        return cargoWeight;
    }
    public String toString(){
        return ("truck's cargo, "+cargo+", weighs"+cargoWeight+" pounds.");
                
        
        
    }
    public void setCargo(int newWeight, String newCargo){
        cargo = newCargo;
        cargoWeight= newWeight;
    }
}    
    
