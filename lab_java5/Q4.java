package lab_java5;

import java.io.File;

public class Q4 {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "example.txt";
        File file = new File(filePath);

        // Check if the file exists
        if (file.exists()) {
            // Display file details
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("File Length (in bytes): " + file.length());

            // Attempt to delete the file
            boolean deleted = file.delete();
            System.out.println("File Deletion Status: " + (deleted ? "Success" : "Failed"));
        } else {
            System.out.println("The file does not exist!");
        }
    }
}

// output:-
// File Name: example.txt
// Absolute Path: /home/vikashpal28/Desktop/java_training/lab_java5/example.txt
// Readable: true
// Writable: true
// File Length (in bytes): 20
// File Deletion Status: Success
    

