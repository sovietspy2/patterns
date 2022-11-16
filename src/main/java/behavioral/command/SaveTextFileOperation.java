package behavioral.command;

public class SaveTextFileOperation implements TextFileOperation {

    private TextFile textFile;


    public SaveTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        System.out.println("File saved!");
        return textFile.save();
    }
}
