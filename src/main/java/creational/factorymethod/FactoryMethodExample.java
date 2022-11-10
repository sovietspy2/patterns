package creational.factorymethod;

import java.util.stream.Stream;

public class FactoryMethodExample {

    public static void run() {

        TransportFactory factory = new BalancedFactory();
        Stream.generate(factory::createTransport).limit(10).forEach(Transport::deliver);


    }

}