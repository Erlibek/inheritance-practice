package task2;

public class Test {
    public static void main(String[] args) {
        AdsService adsService = new AdsService();
        VehicleAd ad1 = new VehicleAd(45, "Volvo", new PassengerType(), new SedanType(), new PetrolType());
        VehicleAd ad2 = new VehicleAd(111, "Kamaz", new TruckType(), new PickUpType(), new DieselType());
        VehicleAd ad3 = new VehicleAd(15, "Toyota", new CarType(), new SedanType(), new DieselType());

        adsService.setAdList(new VehicleAd[]
                {ad1, ad2, ad3});

        adsService.filterByVehicleTypeByPurpose(new PassengerType());
        adsService.filterByVehicleTypeByPurpose(new TruckType());
        adsService.filterByVehicleTypeByFuelTypes(new PetrolType());
    }
}