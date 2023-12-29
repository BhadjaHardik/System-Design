import VehicleFactorys.VehicleFac;
import VehicleFactorys.VehicleFactory;
import Vehicles.Vehicle;

public class App {
    public static void main(String[] args) throws Exception {
        VehicleFac fac = new VehicleFac();
        VehicleFactory VehicleFactory = fac.GetVehicleFectory("Luxery");
        Vehicle vehicle = VehicleFactory.GetVehicle("BMW");
        vehicle.average();
    }
}
     