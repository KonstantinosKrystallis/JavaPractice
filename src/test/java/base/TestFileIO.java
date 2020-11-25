package base;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class TestFileIO {

    @Test
    @DisplayName("readFile tests")
    void readFileTests() {
        Assertions.assertTrue(FileIO.readFile("./src/test/resources/LoremIpsum.txt").exists());
        Assertions.assertTrue(FileIO.readFile("./src/test/resources/Empty.txt").exists());
        Assertions.assertFalse(FileIO.readFile("./src/test/resources/DoesNotExist.txt").exists());
    }

    @Test()
    @DisplayName("Print fileIO tests")
    void printFileTests() {
        Assertions.assertTrue(FileIO.printFileContents(FileIO.readFile("./src/test/resources/LoremIpsum.txt")));
        Assertions.assertTrue(FileIO.printFileContents(FileIO.readFile("./src/test/resources/Empty.txt")));
        Assertions.assertFalse(FileIO.printFileContents(FileIO.readFile("./src/test/resources/DoesNotExist.txt")));
    }


}
