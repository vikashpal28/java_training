import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CharacterStreamReplaceSpace {
    public static void main(String[] args) {
        String inputFile = "t1.txt";  // Input file path
        String outputFile = "t2.txt"; // Output file path

        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {
                // StringBuilder contentWithoutSpaces = new StringBuilder();
                int byteData;
            while ((byteData = fis.read())!= -1) {
                if(byteData == ' '){
                    fos.write('-');
                }
                else{
                    fos.write(byteData);
                }
                 
                
                fos.write(byteData); // Write the byte to the output file
            }

            System.out.println("File processed successfully. Check " + outputFile);

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    
    }
}
