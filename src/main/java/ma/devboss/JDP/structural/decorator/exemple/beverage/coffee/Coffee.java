package ma.devboss.JDP.structural.decorator.exemple.beverage.coffee;

public abstract class Coffee {
    String description;
    int price;
    public abstract int getTotalPrice();

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return this.description;
    }
}
