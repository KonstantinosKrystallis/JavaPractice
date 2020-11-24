package konkry.base;

import java.util.*;

/*
 *author Konstantinos Krystallis
 *@github.com/KonstantinosKrystallis
 */

public class RandomGenerator {
    public static String generateRandomIntegerSequence(int sequenceLength) {
        //Generates a random integer with a length of sequenceLength.
        //Returns a string with the generated integer.
        Random randomGenerator = new Random();
        String integerSequence = "";
        for (int i = 0; i < sequenceLength; i++) {
            integerSequence += randomGenerator.nextInt(10);
        }
        return integerSequence;
    }
}
