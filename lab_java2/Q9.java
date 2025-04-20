class Parent {
    static void staticMethod() {
        System.out.println("Static method in Parent");
    }
}

class Child extends Parent {
    static void staticMethod() { // Attempt to override
        System.out.println("Static method in Child");
    }
}

public class Q9 {
    public static void main(String[] args) {
        Parent.staticMethod(); // Calls Parent's static method
        Child.staticMethod(); // Calls Child's static method

        Parent obj = new Child();
        obj.staticMethod();

    }
}

// output:-
// Static method in Parent
// Static method in Child
// Static method in Parent