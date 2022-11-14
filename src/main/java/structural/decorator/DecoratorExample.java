package structural.decorator;

public class DecoratorExample {

    public static void run() {
        Notification notifyStack = new Notifier();
        notifyStack = new SMSDecorator(notifyStack);
        notifyStack = new TelegramDecorator(notifyStack);
        notifyStack.sendMessage("Hello there!");
    }
}
