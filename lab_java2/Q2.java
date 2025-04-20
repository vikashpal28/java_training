public class Q2 {
    public static void main(String[] args) {
        bike honda = new bike();
        honda.Start();
        honda.Stop();
        System.out.println();
        car tesla = new car();
        tesla.Start();
        tesla.Stop();
    }
}

abstract class Vechicle {
    abstract void Start();

    abstract void Stop();
}

class bike extends Vechicle {
    @Override
    void Start() {
        System.out.println("The bike is start");
    }

    @Override
    void Stop() {
        System.out.println("The bike is stop");
    }
}

class car extends Vechicle {
    @Override
    void Start() {
        System.out.println("The car is start");
    }

    @Override
    void Stop() {
        System.out.println("The car is stop");
    }
}

// output
// The bike is start
// The bike is stop

// The car is start
// The car is stop