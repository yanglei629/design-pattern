package observer;

public class PhoneDisplay implements IObserver {
    private WhetherStation station;

    public PhoneDisplay(WhetherStation station) {
        this.station = station;
    }

    @Override
    public void update() {
        String temperature = this.station.getTemperature();
        this.display(temperature);
    }

    public void display(String temperature) {
        System.out.println("phone: " + temperature);
    }
}
