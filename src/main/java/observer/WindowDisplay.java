package observer;

public class WindowDisplay implements IObserver {
    private WhetherStation station;

    public WindowDisplay(WhetherStation station) {
        this.station = station;
    }

    @Override
    public void update() {
        String temperature = this.station.getTemperature();
        this.display(temperature);
    }

    public void display(String temperature) {
        System.out.println("window: " + temperature);
    }
}
