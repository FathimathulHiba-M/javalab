// Superclass
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Subclass 1
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Subclass 2
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Dynamic {
    public static void main(String[] args) {

        Shape s;   // Parent class reference

        s = new Circle();   // Reference to Circle object
        s.draw();           // Calls Circle's draw()

        s = new Rectangle();  // Reference to Rectangle object
        s.draw();             // Calls Rectangle's draw()
    }
}