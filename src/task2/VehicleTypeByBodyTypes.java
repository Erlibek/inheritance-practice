package task2;

public class VehicleTypeByBodyTypes extends VehicleType {
    public VehicleTypeByBodyTypes() {
        super("Тип автомобиля по кузову");
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        VehicleTypeByBodyTypes that = (VehicleTypeByBodyTypes) object;
        return attribute != null && attribute.equals(that.attribute);
    }
}