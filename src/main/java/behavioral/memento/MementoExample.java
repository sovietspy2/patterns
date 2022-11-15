package behavioral.memento;

public class MementoExample {
    public static void run() {

        TextEditor textEditor = new TextEditor();


        textEditor.typeName("My");
        textEditor.typeName("My name");
        textEditor.typeName("My name is 47");

        textEditor.undo();
        textEditor.undo();


    }
}
