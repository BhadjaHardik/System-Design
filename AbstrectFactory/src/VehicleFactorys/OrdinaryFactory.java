package VehicleFactorys;

import Vehicles.Neno;
import Vehicles.Swift;
import Vehicles.Vehicle;

public class OrdinaryFactory implements VehicleFactory {

    @Override
    public Vehicle GetVehicle(String vehicle) {
        switch (vehicle) {
                    case "Swift":
                        return new Swift();
                        
                    case "Neno":
                        return new Neno();

                    default:
                    return null;
                }
    }

}
