package ma.devboss.JDP.structural.decorator.explication;

public class ConcrateComponent1 extends AbstractComponent{
    private final String description = "concrete 1";
    private final Integer value = 1;

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public Integer getValue() {
        return this.value;
    }

    @Override
    public int accumelate() {
        return this.getValue();
    }
}
