public class Q7 {

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.add(2, 4);
        c1.add(2.01, 7.01);
        c1.add(2.89d, 2366.899d);
    }
}

class Calculator {
    void add(int a, int b) {
        System.out.println("sum of a and b = " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("sum of a and b = " + (a + b));
    }

    void add(float a, float b) {
        System.out.println("sum of a and b = " + (a + b));
    }
}
// output:-
// sum of a and b = 6
// sum of a and b = 9.02
// sum of a and b = 2369.7889999999998