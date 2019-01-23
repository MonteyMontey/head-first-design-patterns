package ObserverPattern;

import java.util.ArrayList;

public class ConcreteSubject implements Subject{

    private ArrayList<Observer> observers;
    private int data;

    public ConcreteSubject(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    // in case you want to do the pull version instead of the push version, just don't send any data and just
    // tell them that there was an update, if they're interested they can fetch it themselves then. For that you may
    // need to pass the subject object

    @Override
    public void notifyObservers() {
        for (Observer observer: observers){
            observer.update(data);
        }
    }

    public void dataChanged(){
        notifyObservers();
    }

    public void setData(int data){
        this.data = data;
        dataChanged();
    }
}
