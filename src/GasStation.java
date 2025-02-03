public class GasStation {
    String title;

    GasStation(String title){
        this.title=title;
    }

    public void refuel(Auto auto){
        auto.drive(120);
        auto.refuel();
    }

    public void refuel(Auto auto,int amount){
    auto.refuel(amount);
    }
}
