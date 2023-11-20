package ma.devboss.JDP.structural.decorator.exemple.beverage.coffee;

public class Americano extends Coffee {

    private final String description= "AMERICAN COFFEE ";
    private final int price = 12;

    @Override
    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int getTotalPrice() {
        return this.price;
    }
}
