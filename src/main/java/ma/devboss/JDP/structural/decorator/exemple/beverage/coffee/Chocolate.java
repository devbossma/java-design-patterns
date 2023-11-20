package ma.devboss.JDP.structural.decorator.exemple.beverage.coffee;

public class Chocolate extends CondimentDecorator{

    private final String description = "with Chokolate ";
    private final int price = 7;

    public Chocolate(Coffee coffe) {
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
