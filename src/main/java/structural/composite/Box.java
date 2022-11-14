package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements PriceAware {

    private final List<PriceAware> items = new ArrayList<>();

    @Override
    public Integer getPrice() {
        return items.stream().mapToInt(PriceAware::getPrice).sum();
    }

    public List<PriceAware> getItems() {
        return items;
    }

    public void addItem(PriceAware item) {
        items.add(item);
    }
}
