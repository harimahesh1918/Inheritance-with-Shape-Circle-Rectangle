// Base Class
class Shape {
    public double area() {
        System.out.println("Default area");
        return 0;
    }
}

// Derived Class - Circle
class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Derived Class - Rectangle
class Rectangle extends Shape {
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

// Main Class to Test
public class ShapeTest {
    public static void main(String[] args) {
        // TC1: Circle with radius 5
        Shape s1 = new Circle(5);
        System.out.printf("Area: %.1f%n", s1.area()); // Expected ≈ 78.5

        // TC2: Rectangle 10x5
        Shape s2 = new Rectangle(10, 5);
        System.out.printf("Area: %.1f%n", s2.area()); // Expected = 50.0

        // TC3: Shape area() not overridden
        Shape s3 = new Shape();
        s3.area(); // Expected: Default area

        // TC4: Zero radius circle
        Shape s4 = new Circle(0);
        System.out.printf("Area: %.1f%n", s4.area()); // Expected = 0.0

        // TC5: Rectangle with width 0
        Shape s5 = new Rectangle(8, 0);
        System.out.prin
