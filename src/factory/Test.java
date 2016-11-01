package factory;

public class Test {

    public static void main(String[] args) {
        // VehicleFactory f = new CarFactory();
        VehicleFactory f = new TrainFactory();
        Vehicle v = f.createVehicle();
        v.move();
    }
}
