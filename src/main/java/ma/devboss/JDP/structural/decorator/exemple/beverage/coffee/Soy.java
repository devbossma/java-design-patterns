package ma.devboss.JDP.structural.decorator.exemple.beverage.coffee;

public class Soy extends CondimentDecorator{

    private final String description = "with Soy ";
    private final int price = 5;

    public Soy(Coffee coffe) {
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
