public class Q6 {
    public static void main(String[] args) {
        Person p1 = new Student("vikash", 21, 23);
        p1.Details();
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void Details() {
        System.out.println("Name = " + name);
        System.out.println("age = " + age);
    }
}

class Student extends Person {
    int RollNo;

    Student(String name, int age, int RollNo) {
        super(name, age);
        this.RollNo = RollNo;
    }

    void Details() {
        super.Details();
        System.out.println("Roll no = " + RollNo);
    }
}

// output:-
// Name = vikash
// age = 21
// Roll no = 23