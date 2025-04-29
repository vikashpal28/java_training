import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamToUpper {
    public static void main(String[] args) {
        String inputFile = "input.txt";  // Input file path
        String outputFile = "output.txt"; // Output file path

        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                // Check if the byte represents a lowercase letter and convert to uppercase
                if (byteData >= 'a' && byteData <= 'z') {
                    byteData = byteData - ('a' - 'A'); // Convert to uppercase
                }
                fos.write(byteData); // Write the byte to the output file
            }

            System.out.println("File processed successfully. Check " + outputFile);

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}