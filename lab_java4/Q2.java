public class Q2 {
    public static void main(String[] args) {
        Table2 t2 = new Table2();
        Table3 t3 = new Table3();
        Thread T2 = new Thread(t2);
        Thread T3 = new Thread(t3);
        T2.start();
        T3.start();
    }
}

class Table2 implements Runnable {
    int t = 2;

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(t + " * " + i + " = " + (t * i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted " + e.getMessage());
            }
        }
    }
}

class Table3 implements Runnable {
    int t = 3;

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(t + " * " + i + " = " + (t * i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted " + e.getMessage());
            }
        }
    }
}

// output:-

// 2 * 1 = 2
// 3 * 1 = 3
// 2 * 2 = 4
// 3 * 2 = 6
// 2 * 3 = 6
// 3 * 3 = 9
// 2 * 4 = 8
// 3 * 4 = 12
// 2 * 5 = 10
// 3 * 5 = 15
// 2 * 6 = 12
// 3 * 6 = 18
// 2 * 7 = 14
// 3 * 7 = 21
// 2 * 8 = 16
// 3 * 8 = 24
// 2 * 9 = 18
// 3 * 9 = 27
// 2 * 10 = 20
// 3 * 10 = 30