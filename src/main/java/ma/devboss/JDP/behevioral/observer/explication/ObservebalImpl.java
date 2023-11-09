package ma.devboss.JDP.behevioral.observer.explication;

import java.util.ArrayList;
import java.util.List;

public class ObservebalImpl implements ObservebalInterface {
    private int stat = 0;
    private List<ObserverInterface> observers = new ArrayList<>();

    public int getStat() {
        return stat;
    }

    public void setStat(int stat) {
        this.stat = stat;
        this.notifyObservers();

    }


    @Override
    public void subscribeObserver(ObserverInterface observer) {
        this.observers.add(observer);
        System.out.println(" Observer N°: "+ observers.size()+" Successfully added to th list of observers");
    }

    @Override
    public void unSubscribeObserver(ObserverInterface observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(obs -> obs.update(this.stat));
    }
}
