package ma.devboss.JDP.structural.decorator.exemple.beverage.coffee;

public class Milk extends CondimentDecorator{

    private final String description = "with Milk ";
    private final int price = 3;

    public Milk(Coffee coffe) {
        super(coffe);
    }

    @Override
    public int getTotalPrice() {
        return coffe.getTotalPrice() + price;
    }

    @Override
    public String getDescription() {
        return coffe.getDescription() + description;
    }
}
