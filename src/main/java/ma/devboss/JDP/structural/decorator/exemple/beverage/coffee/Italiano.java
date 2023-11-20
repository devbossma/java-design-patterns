package ma.devboss.JDP.structural.decorator.exemple.beverage.coffee;

public class Italiano extends Coffee {

    private final String description= "ITALIAN COFFEE ";
    private final int price = 12;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getTotalPrice() {
        return this.price;
    }
}
