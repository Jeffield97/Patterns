package Observer;

import Observer.impl.Observer;

public interface ISubject {
    void addObserver(Observer observer);
    void removeObserver(String id);
    void notifyObserver();
}
