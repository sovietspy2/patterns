package behavioral.memento;

import org.junit.jupiter.api.Test;

public class MementoTest {

    @Test
    public void givenThreeChangesToTextfield_whenDoingUndoTwice_weShouldGetBackToFirstChange() {
        TextEditor textEditor = new TextEditor();


        textEditor.typeName("My");
        textEditor.typeName("My name");
        textEditor.typeName("My name is 47");

        textEditor.undo();
        textEditor.undo();
    }
}
