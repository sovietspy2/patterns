package structural.adapter;

import java.time.LocalDate;
import java.time.ZoneId;

public class ProductExampleAdapter {

    private final ProductExample productExample;

    public ProductExampleAdapter(ProductExample productExample) {
        this.productExample = productExample;
    }

    public LocalDate getCreateDate() {
        return productExample.getCreateDate().toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    public Integer getId() {
        return productExample.getId();
    }

}