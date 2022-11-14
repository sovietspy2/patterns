package structural.decorator;

public class TelegramDecorator extends BaseDecorator {

    public TelegramDecorator(Notification wrappee) {
        super(wrappee);
    }

    @Override
    public void sendMessage(String msg) {
        super.sendMessage(msg);
        sendTelegram(msg);
    }

    private void sendTelegram(String msg) {
        System.out.println(msg + ", message sent in Telegram");
    }
}
