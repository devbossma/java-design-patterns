package ma.devboss.JDP.structural.decorator.explication;

public abstract class AbstractComponent {
    String description;
    Integer value;

    public String getDescription() {
        return description;
    }

    public Integer getValue() {
        return value;
    }

    public abstract int accumelate();
}
