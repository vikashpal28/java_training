package lab_java5;

import java.io.File;
import java.io.IOException;

public class Q2 {
    public static void main(String[] args) throws IOException {
        // Create a File object with the name "project.txt"
        File file = new File("project.txt");

        // Check if the file already exists
        if (file.exists()) {
            System.out.println("File already exists: " + file.getAbsolutePath());
        } else {
            // Create the new file
            if (file.createNewFile()) {
                System.out.println("File created successfully: " + file.getAbsolutePath());
            } else {
                System.out.println("Failed to create the file.");
            }
        }
    
    }
}

// output:-
// File already exists: /home/vikashpal28/Desktop/java_training/project.txt
// File already exists: /home/vikashpal28/Desktop/java_training/project.txt