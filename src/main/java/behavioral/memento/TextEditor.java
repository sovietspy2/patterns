package behavioral.memento;

import java.util.Stack;

public class TextEditor {

    private TextWindow textWindow = new TextWindow();
    private Stack<TextWindowState> history = new Stack<>();

    public void typeName(String name) {
        history.push(textWindow.save());
        textWindow.setNameField(name);
        textWindow.printWindow();
    }

    public void undo() {
        if (history.size()>1) {
            textWindow.restore(history.pop());
            textWindow.printWindow();
        } else {
            System.out.println("History is empty");
        }

    }





}
