class Demo {

    private int a = 10;      // Private variable
    protected int b = 20;    // Protected variable
    public int c = 30;       // Public variable

    public void show() {
        System.out.println("Private a = " + a);
        System.out.println("Protected b = " + b);
        System.out.println("Public c = " + c);
    }
}

public class Main {
    public static void main(String[] args) {

        Demo obj = new Demo();

        // obj.a = 5;  ❌ Not allowed (private)

        obj.b = 25;   // Allowed (same package)
        obj.c = 35;   // Allowed (public)

        obj.show();
    }
}