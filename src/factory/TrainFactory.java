package factory;

public class TrainFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Train();
    }
}
