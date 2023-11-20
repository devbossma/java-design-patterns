package ma.devboss.JDP.structural.decorator.explication;

public class MainClient {
    public static void main(String[] args) {
        AbstractComponent c1 = new ConcrateComponent1();
        c1 = new ConcrateDecorator1(c1);
        c1 = new ConcrateDecorator2(c1);
        System.out.println(c1.accumelate());
    }
}
