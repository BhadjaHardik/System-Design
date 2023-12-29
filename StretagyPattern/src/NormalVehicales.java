import Strategy.NormalDriveStrategy;

public class NormalVehicales extends Vehicales {

    NormalVehicales() {
        super(new NormalDriveStrategy());
    }
    
}
