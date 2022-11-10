package creational.prototype;

import java.math.BigDecimal;

public class PrototypeExample {
    public static void run() {

        Tree tree = new Tree(
                1,
                2,
                "Tree name",
                "geha",
                123,
                BigDecimal.ONE
        );

        var newTree = tree.clone(10, 50);


    }
}
