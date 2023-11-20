package ma.devboss.JDP.structural.decorator.explication;

public class ConcrateDecorator1 extends Decorator {

    private final String description= "decorator 1";
    private final Integer value = 10;
    public ConcrateDecorator1(AbstractComponent component) {
        super(component);
    }

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public int accumelate() {
        return component.accumelate() + this.getValue();
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
