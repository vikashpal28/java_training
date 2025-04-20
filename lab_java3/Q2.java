public class Q2 {
    public static void main(String[] args) {
        NullPointer n1 = new NullPointer(null);
        try {
            n1.length();
        } catch (NullPointerException e) {
            System.out.println("Null pointer is occurred");
        } finally {
            NullPointer n2 = new NullPointer("vikash");
            n2.length();
        }
    }
}

class NullPointer {
    String str;

    NullPointer(String str) {
        this.str = str;
    }

    void length() {
        System.out.println("length of the string = " + str.length());
    }
}

// output
// Null pointer is occurred
// length of the string = 6
