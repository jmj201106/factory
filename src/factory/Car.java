package factory;

public class Car extends Vehicle {

    // private static final class SingletonHolder {
    // private static final Car INSTANCE = new Car();
    // }
    //
    // private Car() {
    //
    // }
    //
    // public static final Car getInstance() {
    // return SingletonHolder.INSTANCE;
    // }

    public void move() {
        System.out.println("car is moving");
    }
}
