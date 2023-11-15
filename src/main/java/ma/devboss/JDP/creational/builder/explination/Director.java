package ma.devboss.JDP.creational.builder.explination;

public class Director {

    public static Product getProduct(Builder b){
        return b.build();
    }


}
