class DieselCar extends Auto {
    private final double MAX_FUEL = 100;

    DieselCar(String licensePlate, String brand, double efficiency, double fuelLast) {
        super(licensePlate, brand, efficiency, fuelLast);
    }

    @Override
    public double calculateRange() {
        return 100 / efficiency * fuelLast;

    }

    @Override
    public void refuel() {
        System.out.printf("Заливаю %.2f литров дизель в \"%s\" %s на %.2f км.%n",
                (MAX_FUEL-fuelLast),licensePlate, brand, MAX_FUEL * 100 / efficiency - calculateRange());
        fuelLast = MAX_FUEL;
        System.out.println("бак полный");
    }

    public void refuel(int liter) {
        fuelLast = fuelLast + liter > MAX_FUEL ? fuelLast : fuelLast + liter;
        System.out.printf(fuelLast == MAX_FUEL ? "Бак заполнен" : "В баке %d литров из %d", fuelLast, MAX_FUEL);

    }
}