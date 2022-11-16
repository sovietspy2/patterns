package behavioral.command;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CommandTest {

    @Test
    public void givenOperationExecutor_whenGivingOperation_operationsShouldBeExecuted() {
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
        var res =
                textFileOperationExecutor.executeOperation(new OpenTextFileOperation(new TextFile("file1.txt")));
        var res2  =
                textFileOperationExecutor.executeOperation(new SaveTextFileOperation(new TextFile("file2.txt")));

        Assertions.assertEquals("Opening file file1.txt", res);
        Assertions.assertEquals("Saving file file2.txt", res2);

        Assertions.assertEquals(2, textFileOperationExecutor.getOperationCount());
    }

    @Test
    public void givenOperationExecutor_whenGivingOperation_operationsShouldBeExecuted_FUNCTIONAL() {
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
        var res = textFileOperationExecutor.executeOperation( ()-> "file1.txt");

        Assertions.assertEquals("file1.txt", res);
    }

    @Test
    public void givenOperationExecutor_whenGivingOperation_operationsShouldBeExecuted_METHOD_REFERENCES() {
        var textFileOperationExecutor = new TextFileOperationExecutor();

        var textFile = new TextFile("file.txt");

        var res = textFileOperationExecutor.executeOperation(textFile::save);

        Assertions.assertEquals("Saving file file.txt", res);
    }
}
