class AtoE extends Thread {
    public void run() {
        for (int A = 65; A <= 69; A++) {
            System.out.println((char) A);
            // Convert ASCII to character
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread Exception = " + e.getMessage());
            }
        }
        System.out.println("AtoE done");
    }
}

class FtoJ extends Thread {
    public void run() {
        for (int A = 70; A <= 74; A++) {
            System.out.println((char) A); // Convert ASCII to character
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread Exception = " + e.getMessage());
            }
        }
        System.out.println("FtoJ done");
    }
}

public class Q3 {
    public static void main(String[] args) {
        AtoE a1 = new AtoE();
        FtoJ a2 = new FtoJ();

        a1.start(); // Starts a new thread for AtoE
        a2.start(); // Starts a new thread for FtoJ
    }
}

// output:-
// A
// F
// G
// B
// H
// C
// I
// D
// J
// E
// FtoJ done
// AtoE done