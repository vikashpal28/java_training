package lab_java5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Q3 {
    public static void main(String[] args) {
        String fileName = "t1.txt"; // Replace with your file name
        int lineCount = 0;
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into words using whitespace as the delimiter
                String[] lines = line.split("\\t+");
                lineCount += lines.length; // Add the number of words in this line to the total count
                String[] words = line.split("\\s");
                wordCount += words.length;

            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        System.out.println("Total number of lines in the file: " + lineCount);
        System.out.println("Total number of words in the file: " + wordCount);
    }
}

// output:-
// Total number of lines in the file: 3
// Total number of words in the file: 6