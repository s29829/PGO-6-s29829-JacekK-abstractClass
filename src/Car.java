public class Car extends Vehicle {

    private double milesDriven, fuelConsumed;

    public Car(String make, String model, int year, double milesDriven, double fuelConsumed) {
        super(make, model, year);
        setMilesDriven(milesDriven);
        setFuelConsumed(fuelConsumed);
    }

    private double getMilesDriven() {
        return milesDriven;
    }

    private void setMilesDriven(double milesDriven) {
        this.milesDriven = milesDriven;
    }

    private double getFuelConsumed() {
        return fuelConsumed;
    }

    private void setFuelConsumed(double fuelConsumed) {
        this.fuelConsumed = fuelConsumed;
    }

    @Override
    public double calculateFuelEfficiency() {
        return getMilesDriven() /getFuelConsumed();
    }
}
