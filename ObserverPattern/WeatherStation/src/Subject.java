import java.util.ArrayList;

public interface Subject {
    ArrayList<Observer> observers = new ArrayList<>();

    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
