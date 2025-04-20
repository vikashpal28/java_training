public class Q4 {
    public static void main(String[] args) {
        voting p1 = new voting(17);
        try {
            p1.validAge();
        } catch (AgeNotValidException e) {
            System.out.println("Error caught:- " + e.getMessage());
        }
    }
}

class voting {
    int age;

    voting(int age) {
        this.age = age;
    }

    void validAge() throws AgeNotValidException {
        if (age < 18) {
            throw new AgeNotValidException("This is not right age for voting");
        } else {
            System.out.println("Suitable age for voting");
        }
    }
}

class AgeNotValidException extends Exception {
    public AgeNotValidException(String message) {
        super(message);
    }
}

// output
// Error caught:- This is not right age for voting