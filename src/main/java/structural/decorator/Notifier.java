package structural.decorator;

public class Notifier implements Notification {

    @Override
    public void sendMessage(String msg) {
        System.out.println(msg + ", message sent in email");
    }
}
