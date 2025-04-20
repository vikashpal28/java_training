class EvenThread extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            if(i%2==0){
            System.out.println("Even: " + i);
            try {
                Thread.sleep(500); // Adding delay for better visualization
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if(i%2!=0){
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(500); // Adding delay for better visualization
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        evenThread.start(); // Start the even number thread
        oddThread.start(); // Start the odd number thread
    }
}