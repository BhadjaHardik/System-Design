package VehicleFactorys;

import Vehicles.Audi;
import Vehicles.BMW;
import Vehicles.Vehicle;

public class LuxeryFactory implements VehicleFactory {

    @Override
    public Vehicle GetVehicle(String vehicle) {
         
        switch (vehicle) {
            case "BMW":
                return new BMW();
                
            case "Audi":
                return new Audi();

            default:
            return null;
        }
    };
}
