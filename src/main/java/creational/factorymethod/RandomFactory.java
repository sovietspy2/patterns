package creational.factorymethod;

import java.util.Random;

public class RandomFactory extends TransportFactory{
    @Override
    public Transport createTransport() {
        Random rand = new Random();
        int value = rand.nextInt(10);
        if (value%2==0) {
            return new Ship();
        } else {
            return new Truck();
        }
    }
}
