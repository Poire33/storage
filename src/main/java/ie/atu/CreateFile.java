package ie.atu;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        // Specify the file name
        String fileName = "File13.txt";

        // Create a File object
        File myFile = new File(fileName);

        try
        {
            // Create a new file on the disk
            if (myFile.createNewFile()) {
                System.out.println("File created successfully at " + myFile.getAbsolutePath());
            } else {
                System.out.println("File already exists at " + myFile.getAbsolutePath());
            }
        } catch(IOException e) {
            System.out.println("An error occurred when creating the file.");
            e.printStackTrace();
        }
    }
}
