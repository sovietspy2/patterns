package behavioral.mediator;

public class MediatorExample {

    public static void run() {

        var button = new Button();
        var fan = new Fan();
        var powerSupplier = new PowerSupply();

        var mediator = new Mediator();

        mediator.setFan(fan);
        mediator.setButton(button);
        mediator.setPowerSupplier(powerSupplier);

        System.out.println(fan);

        button.press();

        System.out.println(fan);

        button.press();

        System.out.println(fan);

        button.press();
    }

}
