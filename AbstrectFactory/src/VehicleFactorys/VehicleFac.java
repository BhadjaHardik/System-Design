package VehicleFactorys;


public class VehicleFac  {

    public VehicleFactory GetVehicleFectory(String fecctory) {
        switch (fecctory) {
            case "Luxery":
                return new LuxeryFactory();
                
            case "Ordinal":
                return new OrdinaryFactory();

            default:
            return null;
        }
    }

}
