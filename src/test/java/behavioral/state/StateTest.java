package behavioral.state;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StateTest {

    @Test
    public void givenDocumentInDraftState_whenAddingDataAndPublishing_thenDocumentStatusShouldBePublished() {
        Document document = new Document();

        document.appendData("data");

        document.publish();
        document.publish();
        document.publish();

        assertEquals(document.getState(), DocumentState.PUBLISHED);
    }

    @Test
    public void givenPublishedDocument_whenAppending_documentShouldNotChange() {
        Document document = new Document();

        document.appendData("data");

        document.publish();
        document.publish();
        document.publish();

        document.appendData("test");

        assertEquals(document.getData(), List.of("data"));
    }

}
