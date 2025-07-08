package Observer.impl;

import java.util.ArrayList;
import java.util.List;

import Observer.ISubject;

public class Subject implements ISubject {
    private String state;
    List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(String id) {
        observers.removeIf(obs -> obs.id.equals(id));
    }

    

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.updated(null);
        }
    }

}
