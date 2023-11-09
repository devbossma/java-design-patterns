package ma.devboss.JDP.behevioral.observer.explication;

public class ObserverInterfaceImpl2 implements ObserverInterface {
    private final String observerName = "Observer 2";
    @Override
    public void update(int stat) {
        this.updeted(stat);
    }
    private void updeted(int i){
        System.out.println(this.observerName + " >>> The new observable stat is: " + i);
    }
}
