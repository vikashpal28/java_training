public class Q1 {

    public static void main(String[] args) {
        Division d = new Division(6, 0);
        d.check();

    }
}

class Division {
    int a;
    int b;

    Division(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void check() {
        try {
            if (b == 0) {
                throw new ArithmeticException("error is occurred");
            } else {
                System.out.println("division = " + (a / b));
            }
        } catch (ArithmeticException e) {
            System.out.println("Exception:-" + e.getMessage());
        } finally {
            System.out.println("after try catch");
        }
    }
}

// output:-
// Exception:-error is occurred
// after try catch