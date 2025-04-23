 // Abstract class
public abstract class Vehicle {
    private int noOfTires;

    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires; }

    public int getNoOfTires() {
        return noOfTires; }

    public abstract void commute();
}

public class Car extends Vehicle {
    public Car() {
        super(4);   }

    @Override
    public void commute() {
        System.out.println("Car is driving...");
    }
}

public class TestAbstraction {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Number of tires: " + car.getNoOfTires());
        car.commute();    }
}



//Interface 
interface Vehicle {
    int getNoOfTires();
    void commute();}

class Car implements Vehicle {
    private int noOfTires;

    public Car() {
        this.noOfTires = 4; }

    public int getNoOfTires() {
        return noOfTires; }

    public void commute() {
        System.out.println("Car is driving..."); }
}
public class TestInterface {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Number of tires="+car.getNoOfTires());
        car.commute();
    }
}





