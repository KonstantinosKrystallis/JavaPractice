import java.io.*;
import java.util.*;

/*
 *author Konstantinos Krystallis
 *@github.com/KonstantinosKrystallis
 */

public class FileIO {
    // This is used to get a path to file from the user.
    // Returns a string containing the user's input.
    public static String readFilePath() {
        String filePath = UserInput.readString("Enter file path (eg. C:/Users/*Your_Username*/TextFile.txt)");
        return filePath;
    }

    // Prints the contents of a given file line by line.
    // Checks if file exists. If it does not it informs the user.
    public static void printFileContents(File file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            System.out.println("The contents of the file are:");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("File not found. Check the path again.");
        }
    }

    // Reads the contents of a given file line by line
    // and stores them into a String ArrayList.
    // Checks if file exists. If it does not it informs the user.
    public static ArrayList<String> readFileContents(File file) {
        System.out.println("Reading file...");
        try (Scanner scanner = new Scanner(file)) {
            ArrayList<String> array = new ArrayList<String>();
            String line;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                array.add(line);
            }
            System.out.println("File read.");
            return array;
        } catch (Exception e) {
            System.out.println("File not found. Check the path again.");
        }
        return new ArrayList<String>();
    }

    public static ArrayList<String> splitFileContents(File file, String delimiter) {
        System.out.println("Spliting file contents...");
        try (Scanner scanner = new Scanner(file)) {
            ArrayList<String> array = new ArrayList<String>();
            String line;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                array.add(line);
            }
            System.out.println("File read.");
            return array;
        } catch (Exception e) {
            System.out.println("File not found. Check the path again.");
        }
        return new ArrayList<String>();
    }
}