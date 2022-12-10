package task2;

public class VehicleAd {
    private final int id;
    private final String model;
    private final VehicleTypeByPurpose vehicleTypeByPurpose;
    private final VehicleTypeByBodyTypes vehicleTypeByBodyTypes;
    private final VehicleTypeByFuelTypes vehicleTypeByFuelTypes;

    public VehicleAd(int id, String model, VehicleTypeByPurpose vehicleTypeByPurpose, VehicleTypeByBodyTypes vehicleTypeByBodyTypes, VehicleTypeByFuelTypes vehicleTypeByFuelTypes) {
        this.model = model;
        this.id = id;
        this.vehicleTypeByPurpose = vehicleTypeByPurpose;
        this.vehicleTypeByBodyTypes = vehicleTypeByBodyTypes;
        this.vehicleTypeByFuelTypes = vehicleTypeByFuelTypes;
    }

    public String getModel() {
        return model;
    }

    public int getId() {
        return id;
    }

    public VehicleTypeByPurpose getVehicleTypeByPurpose() {
        return vehicleTypeByPurpose;
    }

    public VehicleTypeByBodyTypes getVehicleTypeByBodyTypes() {
        return vehicleTypeByBodyTypes;
    }

    public VehicleTypeByFuelTypes getVehicleTypeByFuelTypes() {
        return vehicleTypeByFuelTypes;
    }

    public String toString() {
        return model;
    }
}