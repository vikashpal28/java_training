public class Q3 {
    public static void main(String[] args) {
        Employee e1 = new Developer();// run time polymorphism
        Employee e2 = new Manager();
        e1.Work();
        e2.Work();
    }
}

class Employee {
    void Work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {
    void Work() {
        System.out.println("Developer is working");
    }
}

class Manager extends Employee {
    void Work() {
        System.out.println("Manager is working");
    }
}

// output:-
// Developer is working
// Manager is working