package structural.composite;

public class CompositeExample {

    public static void run() {

        var mainPackage = new Box();
        var hardwareStorePackage = new Box();
        var houseSuppliesPackage = new Box();

        var product1 = new Product("Hammer",10);
        var product2 = new Product("Peg", 2);
        hardwareStorePackage.addItem(product1);
        hardwareStorePackage.addItem(product2);


        var product3 = new Product("Washing machine", 200);
        var product4 = new Product("Washing liquid", 10);
        houseSuppliesPackage.addItem(product3);
        houseSuppliesPackage.addItem(product4);

        var product5 = new Product("Lego Millenium Falcon", 500);
        mainPackage.addItem(product5);
        mainPackage.addItem(hardwareStorePackage);
        mainPackage.addItem(houseSuppliesPackage);

        // total price is 722

        System.out.println("Total price of all boxes: "+mainPackage.getPrice());

    }

}
