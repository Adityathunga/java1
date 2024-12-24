abstract class Shape1 {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle1 extends Shape1 {
    private double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
class Triangle1 extends Shape1 {
    private double side1, side2, side3;
    private double base, height;
    public Triangle1(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle1(double base, double height) {
        this.base = base;
        this.height = height;
    }
    double calculateArea() {
        if (base > 0 && height > 0) { // Check if base and height are provided
            return 0.5 * base * height;
        } else { // Calculate using Heron's formula if sides are provided
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }
    }
    double calculatePerimeter() {
        if (side1 > 0 && side2 > 0 && side3 > 0) { // Check if sides are provided
            return side1 + side2 + side3;
        } else {
            return -1; // Invalid for base-height triangles
        }
    }
}

public class A6 {
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1(5);
        System.out.println("Area and circumference of circle:");
        System.out.println("Area: " + circle1.calculateArea());
        System.out.println("Circumference: " + circle1.calculatePerimeter());
        Triangle1 triangleWithSides = new Triangle1(3, 4, 5);
        System.out.println("Area and perimeter of triangle with sides:");
        System.out.println("Area: " + triangleWithSides.calculateArea());
        System.out.println("Perimeter: " + triangleWithSides.calculatePerimeter());
        Triangle1 triangleWithBaseHeight = new Triangle1(6, 8);
        System.out.println("Area of triangle with base and height:");
        System.out.println("Area: " + triangleWithBaseHeight.calculateArea());
    }
}



