package ma.devboss.JDP.creational.builder.explination;

public class ProductBuilder implements Builder{

    private Integer id;
    private String name;
    private String description;
    private Double price;

    public ProductBuilder() {

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public ProductBuilder setId(Integer id) {
        this.id = id;
        return this;
    }

    public ProductBuilder setName(String name) {
        if(name.isBlank())
            this.name = "Blank";
        else
            this.name = name;
        return this;
    }

    public ProductBuilder setDescription(String description) {
        if (description.isBlank())
            this.description = "Description not provided";
        else
            this.description = description;
        return this;
    }

    public ProductBuilder setPrice(Double price) {
        this.price = price;
        return this;
    }

    @Override
    public Product build() {
        return new Product(this);
    }


}
