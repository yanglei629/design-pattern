package observer;

public class Client {
    public static void main(String[] args) {
        WhetherStation station = new WhetherStation();

        PhoneDisplay phoneDisplay = new PhoneDisplay(station);
        station.add(phoneDisplay);

        WindowDisplay windowDisplay = new WindowDisplay(station);
        station.add(windowDisplay);

        station.setTemperature("36");
        station.inotify();
    }
}
