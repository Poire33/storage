package ie.atu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {
        // Specify the file name
        String fileName = "File14.txt";

        // Create a File object
        File myFile = new File(fileName);

        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("New content");

            System.out.println("Content successfully written to the file");
            writer.close();
        } catch(IOException e) {
            System.out.println("An error occurred when writing to the file.");
            e.printStackTrace();
        }
    }
}
