package structural.bridge;

public class BridgeExample {

    public static void run() {

            Device device = new Tv();

            System.out.println("Tests with basic remote.");
            BasicRemote basicRemote = new BasicRemote(device);
            basicRemote.power();
            device.printStatus();

            System.out.println("Tests with advanced remote.");
            AdvancedRemote advancedRemote = new AdvancedRemote(device);
            advancedRemote.power();
            advancedRemote.mute();
            device.printStatus();
    }

}
