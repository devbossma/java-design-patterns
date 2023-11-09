package ma.devboss.JDP.behevioral.strategy.explication;

public class Client {

    StrategyInterface strategy;
    public void process() {
        strategy.doStrategy();
    }
    public void setStrategy(StrategyInterface strategy) {
        this.strategy = strategy;
    }
}
