package structural.decorator;

public class SMSDecorator extends BaseDecorator {

    protected SMSDecorator(Notification wrappee) {
        super(wrappee);
    }

    @Override
    public void sendMessage(String msg) {
        super.sendMessage(msg);
        sendSMS(msg);
    }

    private void sendSMS(String msg) {
        System.out.println(msg + ", message sent in SMS");
    }
}
