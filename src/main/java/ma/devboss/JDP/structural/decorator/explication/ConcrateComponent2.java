package ma.devboss.JDP.structural.decorator.explication;

public class ConcrateComponent2 extends AbstractComponent{
    private final String description = "concrete 2";
    private final Integer value = 2;

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
