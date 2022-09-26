public class Car extends Vehicle {
    private String steering;
    private int gears;


    public Car(String name, String type, int wheels, int speed) {
        super(name, type, wheels, speed);

        this.steering = steering;
        this.gears = gears;
    }
}
