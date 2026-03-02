// Abstract class
abstract class Shape {

    // Abstract method
    abstract void calculateArea();

    // Concrete method
    void display() {
        System.out.println("Area calculation");
    }
}

// Subclass Circle
class Circle extends Shape {
    double radius = 5;

    @Override
    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    int length = 4;
    int breadth = 6;

    @Override
    void calculateArea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.calculateArea();

        r.display();
        r.calculateArea();
    }
}