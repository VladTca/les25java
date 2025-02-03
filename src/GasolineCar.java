class GasolineCar extends Auto {
    private final int MAX_FUEL = 80;

    public GasolineCar(String licensePlate, String brand, double efficiency, double fuelLast) {
        super(licensePlate, brand,efficiency,fuelLast);
    }

    @Override
    public double calculateRange() {
        return 100/efficiency * fuelLast;
    }

    @Override
    public void refuel() {
        System.out.printf("Заливаю %.2f литров бензин в %s на %.2f км.%n",
                (MAX_FUEL-fuelLast),this, MAX_FUEL * 100/efficiency - calculateRange());
        fuelLast=MAX_FUEL;
        System.out.println("бак полный");
    }
    public void refuel(int liter){
        fuelLast=fuelLast+liter>MAX_FUEL?fuelLast:fuelLast+liter;
        System.out.printf(fuelLast==MAX_FUEL?"Бак заполнен":"В баке %d литров из %d",fuelLast,MAX_FUEL);

    }

    @Override
    public String toString() {
        return "licensePlate='" + licensePlate + '\'' +
                ", brand='" + brand + '\'';
    }
}