package observer;

public interface IObservable {
    void add(IObserver o);
    void remove(IObserver o);
    void inotify();
}
