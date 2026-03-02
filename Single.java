// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class inherits Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Single {
    public static void main(String[] args) {

        Dog obj = new Dog();

        obj.eat();   // Inherited method
        obj.bark();  // Own method
    }
}