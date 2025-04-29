package serialization;

import java.io.FileInputStream;
// import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class deserialiazation {
    public static void main(String[] args) {
        String filename = "v1.txt";
    try{
        FileInputStream f1 = new FileInputStream(filename);
        ObjectInputStream f2 = new ObjectInputStream(f1);
        Student obj = (Student)f2.readObject();
        System.out.println(obj.StuName);
        System.out.println(obj.RollNo); 
        f1.close();
        f2.close();

    }
    catch(Exception e){
        e.printStackTrace();
    }
    }
    
}
