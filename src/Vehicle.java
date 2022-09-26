public class Vehicle {
    private String name;
    private String type;
    private int wheels;
    private int speed;

    public Vehicle(String name, String type, int wheels, int speed{
        this.name = name;
        this.type = type;
        this.wheels = wheels;
        this.speed = speed;
    }

    public void move(int speed){
        System.out.println("The " + name + "is moving at " + speed);
    }
}
