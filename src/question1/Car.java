package question1;

public class Car {
    private double fuelEfficiency;
    private double fuelLevel;

    public Car(double efficiency){
        fuelEfficiency = efficiency;
        fuelLevel = 0;
    }

    public void drive(double distance){
        fuelLevel -= distance/fuelEfficiency;
    }

    public double getGasLevel(){
        return fuelLevel;
    }

    public void addGas(double gallons){
        fuelLevel += gallons;
    }
}
