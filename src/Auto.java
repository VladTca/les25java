abstract class Auto {
    String licensePlate;
    String brand;
    double fuelLast;
    double efficiency;

    Auto(String licensePlate, String brand,  double efficiency,double fuelLast) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.fuelLast = fuelLast;
        this.efficiency = efficiency;
    }

    abstract double calculateRange();

    abstract void refuel();
    abstract void refuel(int amount);

    public void drive(int distance) {
            fuelLast -= distance * (efficiency/100);
            System.out.printf("Автомобиль проехал %d км, топлива осталось %.2f литров%n", distance, fuelLast);
        }
    }

