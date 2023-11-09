package ma.devboss.JDP.behevioral.observer.explication;

public interface ObservebalInterface {
    void subscribeObserver(ObserverInterface observer);
    void unSubscribeObserver(ObserverInterface observer);
    void notifyObservers();
}
