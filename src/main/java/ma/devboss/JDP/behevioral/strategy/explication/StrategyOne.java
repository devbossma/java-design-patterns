package ma.devboss.JDP.behevioral.strategy.explication;

public class StrategyOne implements StrategyInterface{
    public StrategyOne() {
    }

    @Override
    public void doStrategy() {
        System.out.println("STRATEGY *** ONE *** IN PROCESS");
    }
}
