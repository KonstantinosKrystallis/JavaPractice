package base;

import java.security.SecureRandom;
import java.util.*;

/*
 *author Konstantinos Krystallis
 *@github.com/KonstantinosKrystallis
 */

public class RandomGenerator {
    //Generates a pseudorandom integer with a length of sequenceLength.
    //Returns a string with the generated integer.
    //Uniqueness is not guaranteed.
    public static String generateRandomInteger(int sequenceLength) {
        SecureRandom randomGenerator = new SecureRandom();
        StringBuilder generatedInteger = new StringBuilder(sequenceLength);
        for (int i = 0; i < sequenceLength; i++) {
            generatedInteger.append(randomGenerator.nextInt(10));
        }
        return generatedInteger.toString();
    }

    public static  String generateRandomString (int sequenceLength) {
        final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final String lower = upper.toLowerCase(Locale.ROOT);
        final String digits = "0123456789";
        final String special = "`~!#$%^&*";
        final String combined = upper + lower + digits + special;
        final SecureRandom randomGenerator = new SecureRandom();
        StringBuilder generatedString = new StringBuilder();
        while (generatedString.length() < sequenceLength) {
            generatedString.append(combined.charAt(randomGenerator.nextInt(combined.length())));
        }
        return generatedString.toString();
    }
}
