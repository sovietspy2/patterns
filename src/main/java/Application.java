import creational.abstractfactory.AbstractFactoryExample;
import creational.builder.BuilderExample;
import creational.factorymethod.FactoryMethodExample;
import creational.prototype.PrototypeExample;
import creational.singleton.SingletonExample;

public class Application {

    public static void main(String ...args) {

        FactoryMethodExample.run();

        AbstractFactoryExample.run();

        BuilderExample.run();

        PrototypeExample.run();

        SingletonExample.run();

    }
}
