package structural.proxy;

public class ProxyExample {
    public static void run() {

        SlowServiceManager slowServiceManager = new SlowServiceManager();

        slowServiceManager.process("test");
        slowServiceManager.process("test");

    }
}
