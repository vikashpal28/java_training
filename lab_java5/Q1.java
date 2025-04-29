package lab_java5;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        System.out.println("created the file");
        File f1 = new File("test.txt");
        try {
            if (f1.createNewFile()) {
                System.out.println("file created successfully" + f1.getName());
            } else {
                System.out.println("file already exist");
            }

        } catch (IOException e) {
            e.getStackTrace();
        }
        System.out.println();
        System.out.println("write content to file");
        try {
            FileWriter f2 = new FileWriter("test.txt");
            f2.write("hello vikash");
            f2.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
        System.out.println();
        System.out.println("read and print the content");
        try {
            FileReader f3 = new FileReader("test.txt");
            int str;
            while ((str = f3.read()) != -1) {
                System.out.print((char) (str));
            }
            System.out.println();
            f3.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
        System.out.println();
        System.out.println("count and display no of words");

        try {
            FileReader f4 = new FileReader("test.txt");
            Scanner scanner = new Scanner(f4);
            int str;
            int words_count = 0;
            while ((str = f4.read()) != -1) {
                String line = scanner.nextLine(); // Read a line
                String[] words = line.split("\\s+");
                words_count += words.length;
                // scanner.close();
            }

            System.out.println("count " + words_count);
            scanner.close();
        } catch (IOException e) {
            e.getStackTrace();

        }
        System.out.println();
        try {
            File f5 = new File("test.txt");
            f5.delete();
            System.out.println("deleted " + f5.getName());
        } catch (Exception e) {
            e.getStackTrace();
        }

    }

}
// output:-

// created the file
// file created successfullytest.txt

// write content to file

// read and print the content
// hello vikash

// count and display no of words
// count 2

// deleted test.txt