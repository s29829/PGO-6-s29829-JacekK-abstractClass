public class Truck extends Vehicle {
    private double milesDriven, fuelConsumed, cargoWeight;
    private double paramTruckEfficient = 0.5;

    public Truck(String make, String model, int year, double milesDriven, double fuelConsumed, double cargoWeight) {
        super(make, model, year);
        setMilesDriven(milesDriven);
        setFuelConsumed(fuelConsumed);
        setCargoWeight(cargoWeight);
    }

    public double getMilesDriven() {
        return milesDriven;
    }

    public void setMilesDriven(double milesDriven) {
        this.milesDriven = milesDriven;
    }

    public double getFuelConsumed() {
        return fuelConsumed;
    }

    public void setFuelConsumed(double fuelConsumed) {
        this.fuelConsumed = fuelConsumed;
    }

    public double getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(double cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    @Override
    public double calculateFuelEfficiency() {
        return getMilesDriven()/(getFuelConsumed()+(getCargoWeight()*paramTruckEfficient));
//        return super.calculateFuelEfficiency();
//        milesDriven / (fuelConsumed + (cargoWeight * 0.5))
    }
}
