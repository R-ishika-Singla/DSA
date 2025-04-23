public class TestAbstraction {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Number of tires: " + car.getNoOfTires());
        car.commute();
    }
}

