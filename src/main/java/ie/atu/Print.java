package ie.atu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Print {
    public static void main(String[] args) {
        // Specify the file name
        String fileName = "File15.txt";

        // Create a File object
        File myFile = new File(fileName);

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            writer.println("New content");
            writer.printf("MOAR new content: %d %s%n", 69, "Rhone");

            System.out.println("Content successfully written to the file");
            writer.close();
        } catch(IOException e) {
            System.out.println("An error occurred when writing to the file.");
            e.printStackTrace();
        }
    }
}
