package vehicletest;

// Main Test code for Vehicle application


public class VehicleTest {

   
    public static void main(String[] args) {
        Car car = new Car(10, 200, "Red", true, false);
        System.out.println(car.getKilo()+" km travelled");
        car.fillGas();
        System.out.println(car);
        System.out.println(car.getColour());
        
        System.out.println("");
        Minivan momWhip = new Minivan(700, 50000, "Black", 4, "Soccer" );
        System.out.println(momWhip.getKilo()+" km travelled");
        momWhip.fillGas();
        System.out.println("The Minivan has "+ momWhip.returnCapacity()+" passengers.");
        
        System.out.println(momWhip);
        
       
        System.out.println(momWhip);
        System.out.println(momWhip.getColour());
        System.out.println("White");
        
        Truck truck = new Truck(40, 20000, "Yellow", "Supplies", 600);
        System.out.println(truck.getKilo()+" km travelled");
        truck.fillGas();
        System.out.println(truck.getCargo());
        System.out.println("The truck weighs "+ truck.getWeight()+" pounds.");
        System.out.println(truck);
        truck.setCargo(5000 ,"Boxes" );
        System.out.println(truck);
        
        
    }
    
}