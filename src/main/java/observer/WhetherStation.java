package observer;

import java.util.ArrayList;
import java.util.List;

public class WhetherStation implements IObservable {
    private List<IObserver> observers = new ArrayList<>();
    private String temperature;

    public void add(IObserver o) {
        this.observers.add(o);
    }

    public void remove(IObserver o) {
        this.observers.remove(o);
    }

    public void inotify() {
        this.observers.forEach(observer -> {
            observer.update();
        });
    }

    public String getTemperature() {
        return this.temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
}
