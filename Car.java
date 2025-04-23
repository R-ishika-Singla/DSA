public class Car extends Vehicle {
    public Car() {
        super(4);
    }

    @Override
    public void commute() {
        System.out.println("Car is driving...");
    }
}
