package ma.devboss.JDP.behevioral.observer.explication;

public class Client {

    public static void main() {

    ObserverInterface observer1 = new ObserverInterfaceImpl1();
    ObserverInterface observer2 = new ObserverInterfaceImpl2();
    ObservebalImpl observebal = new ObservebalImpl();

    observebal.subscribeObserver(observer1);
    observebal.subscribeObserver(observer2);
    observebal.setStat(15);
    observebal.setStat(20);
    observebal.setStat(30);


    }
}
