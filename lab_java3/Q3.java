import java.io.FileWriter;
import java.io.IOException;

public class Q3 {
    public static void main(String[] args) {
        FileWrite f2 = new FileWrite();
        try {
            f2.file();
        } catch (IOException e) {
            System.out.println("file is not found");
        }
    }

}

class FileWrite {
    void file() throws IOException {
        FileWriter f1 = new FileWriter("./root/file.txt");
        f1.write("hello");
        f1.close();
    }
}
// output:-
// file is not found
