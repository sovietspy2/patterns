package creational.factorymethod;

public class BalancedFactory extends TransportFactory{

    private int shipCount = 0;
    private int truckCount = 0;

    @Override
    public Transport createTransport() {

        if (shipCount > truckCount) {
            truckCount++;
            return new Truck();
        } else {
            shipCount++;
            return new Ship();
        }

    }
}
