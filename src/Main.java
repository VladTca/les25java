import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Auto> cars = List.of(
                new DieselCar("ZZZ", "Mercedes", 10, 22),
                new GasolineCar("YYY", "BMW", 18.5, 23),
                new ElectricCar("XXX", "Tesla", 800, 53)
        );

        GasStation station =new GasStation("Shell");

        cars.forEach(station::refuel);
    }
}