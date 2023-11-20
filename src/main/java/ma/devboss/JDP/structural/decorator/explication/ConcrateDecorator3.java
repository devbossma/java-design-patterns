package ma.devboss.JDP.structural.decorator.explication;

public class ConcrateDecorator3 extends Decorator {

    private final String description= "decorator 3";
    private final Integer value = 30;
    public ConcrateDecorator3(AbstractComponent component) {
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
