package ma.devboss.JDP.structural.decorator.explication;

public class ConcrateDecorator2 extends Decorator {

    private final String description= "decorator 2";
    private final Integer value = 20;
    public ConcrateDecorator2(AbstractComponent component) {
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
