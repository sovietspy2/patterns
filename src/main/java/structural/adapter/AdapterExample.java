package structural.adapter;

import java.time.LocalDate;
import java.util.Date;

public class AdapterExample {

    public static void run() {

        ProductExample productExample= new ProductExample(new Date(), 1);

        var adapter = new ProductExampleAdapter(productExample);

        if (adapter.getCreateDate() instanceof LocalDate) {
            System.out.println("adapter returned LocalDate");
        }


    }

}
