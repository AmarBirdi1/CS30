package vehicletest;

// Car for Vehicle application


public class Car extends Vehicle{
    boolean isManual;
    boolean isFast;
    public Car(int g, int k, String c, boolean isFast, boolean isConvert){
        super(g,k,c);
        isFast = isFast;
        isFast = isConvert;
    }
    
    public String getManual(){
        String out;
        if(isFast){
           out = "This car is a manual.";
        }else{
            out = "This car isnt a manual.";
        }    
            return out;
     
    }
    /**
     *
     * @return
     */
    public String getAuto(){
        String outinfo;
        if(isFast){
            outinfo = "This car is fast.";
        }else{
            outinfo = "THis car is standard";
        }
        return outinfo;
    }
    public String toString(){
        String out;
        out = "Car is fast: "+isFast+", Car is manual: "+isManual;
        return out;
    }
    
}