package structural.composite;

public class Product implements PriceAware {

    private final String name;
    private final Integer price;

    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getPrice() {
        return price;
    }
}
