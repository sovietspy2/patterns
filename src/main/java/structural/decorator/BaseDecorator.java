package structural.decorator;

public abstract class BaseDecorator implements Notification {

    private final Notification wrappee;

    protected BaseDecorator(Notification wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void sendMessage(String msg) {
        wrappee.sendMessage(msg);
    }
}
