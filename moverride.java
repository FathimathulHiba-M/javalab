// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {

    // Overriding method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class moverride {
    public static void main(String[] args) {

        Animal obj = new Dog();  // Parent reference, child object
        obj.sound();             // Calls overridden method
    }
}