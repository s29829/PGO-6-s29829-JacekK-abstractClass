import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPgo6 {
    Car car01 = new Car("Ford", "Mondeo", 2024, 7, 8);

    Truck truck01 = new Truck("Ford", "Mondeo", 2024, 7, 8, 8);


    @Test
    public void testCarCalculateFuelEfficiency() {
        Assertions.assertEquals(car01.calculateFuelEfficiency(), 0.875);
    }

    @Test
    public void testTruckCalculateFuelEfficiency() {
        Assertions.assertEquals(truck01.calculateFuelEfficiency(), 0.5833333333333334);
    }

}
