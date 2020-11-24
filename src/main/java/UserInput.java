import java.util.Scanner;

/*
 *author Konstantinos Krystallis
 *@github.com/KonstantinosKrystallis
 */

public class UserInput {
    // A simple method to get user input in the form of a String.
    // It requires one parameter, the input message the user is prompted with.
    // It returns the input as a String.
    public static String readString(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        String inputString = scanner.nextLine();
        scanner.close();
        return inputString;
    }

    public static int readInt(String msg) {
        // A simple method to get user input in the form of an Int.
        // It requires one parameter, the input message the user is prompted with.
        // It returns the input as an Int.
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        String inputString = scanner.nextLine();
        scanner.close();
        return Integer.parseInt(inputString);
    }

    public static float readFloat(String msg) {
        // A simple method to get user input in the form of a Float.
        // It requires one parameter, the input message the user is prompted with.
        // It returns the input as a Float.
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        String inputString = scanner.nextLine();
        scanner.close();
        return Float.parseFloat(inputString);
    }
}