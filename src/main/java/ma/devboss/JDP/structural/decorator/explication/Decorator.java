package ma.devboss.JDP.structural.decorator.explication;

public abstract class Decorator extends AbstractComponent{
    protected AbstractComponent component;

    public Decorator(AbstractComponent component) {
        this.component = component;
    }

    public abstract String getDescription();


}
