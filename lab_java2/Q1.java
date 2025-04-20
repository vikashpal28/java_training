// Base class
abstract class Shape {
    abstract double calculateArea(); // Abstract method for area calculation
}

// Derived class for Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius; // Area of a circle: πr²
    }
}

// Derived class for Rectangle
class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width; // Area of a rectangle: length × width
    }
}

// Derived class for Triangle
class Triangle extends Shape {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height; // Area of a triangle: ½ × base × height
    }
}

// Main class to test the implementation
public class Q1 {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 8);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Triangle Area: " + triangle.calculateArea());
    }
}

// output:-
// Circle Area: 78.53981633974483
// Rectangle Area: 24.0
// Triangle Area: 12.0