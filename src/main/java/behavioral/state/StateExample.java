package behavioral.state;

public class StateExample {
    public static void run() {
        Document document = new Document();

        document.appendData("data");

        document.publish();
        document.publish();
        document.publish();


    }
}
