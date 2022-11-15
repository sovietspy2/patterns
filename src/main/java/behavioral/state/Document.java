package behavioral.state;

import java.util.ArrayList;
import java.util.List;

public class Document {

    private final List<String> data = new ArrayList<>();
    private DocumentState state = DocumentState.DRAFT;

    public void publish() {

        var prevState = state;

        switch (state) {
            case DRAFT -> this.state = DocumentState.MODERATION;
            case MODERATION -> this.state = DocumentState.PUBLISHED;
            case PUBLISHED -> System.out.println("Document already published!");
        }

        var newState = state;

        System.out.println("State changed from: "+prevState+" to: "+newState);
    }

    public void appendData(String d) {

        if (state==DocumentState.DRAFT) {
            data.add(d);
        } else {
            System.out.println("Appending is not possible in current state");
        }

    }
}
