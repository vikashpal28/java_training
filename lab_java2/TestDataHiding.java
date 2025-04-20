class DataHider {
    // Private data members
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age > 0) { // Validating the input
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

public class TestDataHiding {
    public static void main(String[] args) {
        DataHider obj = new DataHider();

        // Setting values using setter methods
        obj.setName("Vikash");
        obj.setAge(22);

        // Accessing values using getter methods
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());

        // Trying to set an invalid age
        obj.setAge(-5); // Will print a validation message
    }
}
// output:-
// Name: Vikash
// Age: 22
// Age must be positive!