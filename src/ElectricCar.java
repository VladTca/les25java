class ElectricCar extends Auto {
    private double fullСhargeRange;
    private double charge;

    ElectricCar(String licensePlate, String brand, double fullСhargeRange, double charge) {
        super(licensePlate, brand, 0, 0);
        this.fullСhargeRange = fullСhargeRange;
        this.charge = charge;
    }


    @Override
    public double calculateRange() {
        return fullСhargeRange * (charge / 100);
    }

    @Override
    public void refuel() {
        System.out.printf("Дозаряжаю батарею на \"%s\" %s на %s процентов на %s км.%n",
                licensePlate, brand, 100 - charge, fullСhargeRange - calculateRange());
        charge = 100;

    }

    public void refuel(int chargePercent) {
        charge = Math.min(charge + chargePercent, 100);
        System.out.printf(charge == 100 ? "Баттарея заряжена" : "Баттарея заряжена на %d из 100", charge);

    }

    @Override
    public void drive(int distance) {
        charge -= distance / (fullСhargeRange / 100);
        System.out.printf("Автомобиль проехал %d км, заряда осталось %.2f процента\n", distance, charge);
    }
}