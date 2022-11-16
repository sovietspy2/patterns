import behavioral.mediator.MediatorExample;
import behavioral.memento.MementoExample;
import behavioral.state.StateExample;
import creational.abstractfactory.AbstractFactoryExample;
import creational.builder.BuilderExample;
import creational.factorymethod.FactoryMethodExample;
import creational.prototype.PrototypeExample;
import creational.singleton.SingletonExample;
import structural.adapter.AdapterExample;
import structural.bridge.BridgeExample;
import structural.composite.CompositeExample;
import structural.decorator.DecoratorExample;
import structural.facade.FacadeExample;
import structural.flyweight.FlyweightExample;
import structural.proxy.ProxyExample;

public class Application {

    public static void main(String ...args) {

        FactoryMethodExample.run();

        AbstractFactoryExample.run();

        BuilderExample.run();

        PrototypeExample.run();

        SingletonExample.run();

        AdapterExample.run();

        BridgeExample.run();

        CompositeExample.run();

        DecoratorExample.run();

        FacadeExample.run();

        FlyweightExample.run();

        ProxyExample.run();

        MementoExample.run();

        StateExample.run();

        MediatorExample.run();
    }
}
