package Observer.impl;

import Observer.IObserver;

public class Observer implements IObserver {
    public String id;

    public Observer(String id)
    {
        this.id = id;
    }
    @Override
    public String updated(String[] args) {
        String msg = String.format("He sido actualizado: %s", this.id);
        System.out.println(msg);
        return msg;
    }

}
