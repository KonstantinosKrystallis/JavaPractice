package base;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class TestFileIO {

    @Test
    @DisplayName("readFile tests")
    void readFileTests() {
        Assertions.assertTrue(Objects.requireNonNull(FileIO.readFile("./src/test/resources/LoremIpsum.txt")).exists());
        Assertions.assertTrue(Objects.requireNonNull(FileIO.readFile("./src/test/resources/Empty.txt")).exists());
        Assertions.assertFalse(Objects.requireNonNull(FileIO.readFile("./src/test/resources/DoesNotExist.txt")).exists());
    }

    @Test()
    @DisplayName("Print fileIO tests")
    void printFileTests() {
        Assertions.assertTrue(FileIO.printFileContents(FileIO.readFile("./src/test/resources/LoremIpsum.txt")));
        Assertions.assertTrue(FileIO.printFileContents(FileIO.readFile("./src/test/resources/Empty.txt")));
        Assertions.assertFalse(FileIO.printFileContents(FileIO.readFile("./src/test/resources/DoesNotExist.txt")));
    }


}
