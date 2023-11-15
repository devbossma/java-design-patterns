package ma.devboss.JDP.creational.builder.explination;

public class MainClient {
    public static void main(String[] args) {
        Product p1 = Director.getProduct(new ProductBuilder()
                .setId(1)
                .setDescription("")
                .setName("phone")
                .setPrice(253.15)
        );




        System.out.println(p1.toString());
    }

}

