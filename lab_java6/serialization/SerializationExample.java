package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class SerializationExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.RollNo = 23;
        s1.StuName = "vikash";
        String filename = "v1.txt";
        try{
      FileOutputStream f1 = new FileOutputStream(filename);
      ObjectOutputStream f2 = new ObjectOutputStream(f1);
      f2.writeObject(s1);
      f1.close();
      f2.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

class Student implements Serializable{
    public int RollNo;
    public String StuName;
}