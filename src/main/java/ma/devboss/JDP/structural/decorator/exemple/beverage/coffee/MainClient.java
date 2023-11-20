package ma.devboss.JDP.structural.decorator.exemple.beverage.coffee;

public class MainClient {
    public static void main(String[] args) {
        Coffee c1 = new Espresso();
        c1 = new Milk(c1);
        c1 = new Soy(c1);
        System.out.println(c1.getDescription());
        System.out.println(c1.getTotalPrice());
    }
}
