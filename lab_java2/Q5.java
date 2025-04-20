interface Flyable {
    void Fly();
}

class Bird implements Flyable {
    @Override
    public void Fly() {
        System.out.println("Bird is flying");
    }
}

class Aeroplane implements Flyable {
    @Override
    public void Fly() {
        System.out.println("Aeroplane is flying");
    }
}

public class Q5 {

    public static void main(String[] args) {
        Flyable bird = new Bird();
        Flyable Aeroplane = new Aeroplane();
        bird.Fly();
        Aeroplane.Fly();
    }
}

// output:-
// Bird is flying
// Aeroplane is flying