package base;

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
        return UserInput.readString("Enter file path (eg. C:/Users/*Your_Username*/TextFile.txt)");
    }

    public static File readFile(String filePath){
        try {
            return new File(filePath);
        } catch (Exception e) {
            System.out.println("File could not be opened. Please check the file path again.");
        }
        return null;
    }

    // Prints the contents of a given file line by line.
    // Checks if file exists. If it does not it informs the user.
    public static boolean printFileContents(File file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            if (file.length() == 0){
                System.out.println("File is empty.");
                return true;
            }
            System.out.println("The contents of the file are:");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("File not found. Check the path again.");
            return false;
        }
        return true;
    }

    // Reads the contents of a given file line by line
    // and stores them into a String ArrayList.
    // Checks if file exists. If it does not it informs the user.
    public static ArrayList<String> readFileContents(File file) {
        System.out.println("Reading file...");
        try (Scanner scanner = new Scanner(file)) {
            ArrayList<String> array = new ArrayList<>();
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
        return null;
    }

    public static ArrayList<String> splitFileContents(File file, String delimiter) {
        System.out.println("Spliting file contents...");
        try (Scanner scanner = new Scanner(file)) {
            ArrayList<String> array = new ArrayList<>();
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
        return null;
    }
}