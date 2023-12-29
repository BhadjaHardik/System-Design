import Strategy.SpecialDriveStrategy;

public class SpecialVehicales extends Vehicales {

    SpecialVehicales() {
        super(new SpecialDriveStrategy());
    }
    
}
