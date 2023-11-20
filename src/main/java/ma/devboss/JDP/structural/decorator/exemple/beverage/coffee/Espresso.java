package ma.devboss.JDP.structural.decorator.exemple.beverage.coffee;

public class Espresso extends Coffee {

    private final String description= "ESPRESSO COFFEE";
    private final int price = 10;

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
