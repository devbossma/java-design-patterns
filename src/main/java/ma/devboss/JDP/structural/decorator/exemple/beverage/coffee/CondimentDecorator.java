package ma.devboss.JDP.structural.decorator.exemple.beverage.coffee;

public abstract class CondimentDecorator extends Coffee{
    protected Coffee coffe;

    public CondimentDecorator(Coffee coffe) {
        this.coffe = coffe;
    }
    public abstract String getDescription();
}
