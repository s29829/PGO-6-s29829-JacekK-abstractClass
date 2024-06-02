
public class Main {
    public static void main(String[] args) {
        System.out.println("PGO - s29829 - Jacek K - abstract Class");

        Car car01 = new Car("Ford", "Mondeo", 2024,7, 8);
        Truck truck01 = new Truck("Ford", "Mondeo", 2024,7, 8, 8);
        System.out.println(car01.calculateFuelEfficiency());
        System.out.println(truck01.calculateFuelEfficiency());
    }
//    @Test




}