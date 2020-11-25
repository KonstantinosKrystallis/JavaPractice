package base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRandomGenerator {
    @Test
    @DisplayName("testGenerateInteger")
    void testGenerateInteger() {
        final int size = 64;
        assertEquals(size,RandomGenerator.generateRandomInteger(size).length());
    }

    @Test
    @DisplayName("testGenerateString")
    void testGenerateString() {
        final int size = 64;
        assertEquals(size,RandomGenerator.generateRandomString(size).length());
    }
}
