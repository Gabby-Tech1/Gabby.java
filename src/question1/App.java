package question1;

public class App {
    public static void main(String[] args) {
        Car myHybrid = new Car(50);
        myHybrid.addGas(20);
        myHybrid.drive(100);

        System.out.println(myHybrid.getGasLevel());
    }
}
