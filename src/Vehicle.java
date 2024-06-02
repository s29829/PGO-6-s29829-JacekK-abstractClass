abstract public class  Vehicle {

    private String make, model;
    private int year;

    public Vehicle(String make, String model, int year) {
        setMake(make);
        setModel(model);
        setYear(year);
    }

    public double calculateFuelEfficiency(){
        return -1;
    }

    private String getMake() {
        return make;
    }

    private void setMake(String make) {
        this.make = make;
    }

    private String getModel() {
        return model;
    }

    private void setModel(String model) {
        this.model = model;
    }

    private int getYear() {
        return year;
    }

    private void setYear(int year) {
        this.year = year;
    }
}


