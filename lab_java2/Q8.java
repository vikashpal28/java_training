public class Q8 {
    public static void main(String[] args) {
        Payment p1 = new Credit_Card();
        Payment p2 = new Upi_Payment();
        p1.pay(23366);
        p2.pay(6778);
    }
}

abstract class Payment {
    abstract void pay(double amount);
}

class Credit_Card extends Payment {

    public void pay(double amount) {
        System.out.println("credit card amount = " + amount);
    }
}

class Upi_Payment extends Payment {

    public void pay(double amount) {
        System.out.println("Upi payment = " + amount);
    }
}

// output:-
// credit card amount = 23366.0
// Upi payment = 6778.0