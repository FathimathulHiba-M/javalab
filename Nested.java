class Outer {

    int x = 10;  // Outer class variable

    // Nested (Inner) class
    class Inner {
        void display() {
            System.out.println("Value of x = " + x);
        }
    }
}

public class Nested {
    public static void main(String[] args) {

        Outer obj = new Outer();          // Create outer class object
        Outer.Inner innerObj = obj.new Inner();  // Create inner class object

        innerObj.display();
    }
}