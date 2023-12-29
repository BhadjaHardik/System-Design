import Strategy.DriveStrategy;

public class Vehicales {

    DriveStrategy driveStrategy;

    Vehicales(DriveStrategy objDriveStrategy) {
        driveStrategy = objDriveStrategy;
    }

    public void Drive()
    {
        driveStrategy.Drive();
    }
}
