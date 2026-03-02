class Student {
    String name;
    int age;
    int rollNo;

    // Default constructor
    Student() {
        name = "Not Provided";
        age = 0;
        rollNo = 0;
    }

    // Constructor with name
    Student(String name) {
        this.name = name;
        age = 0;
        rollNo = 0;
    }

    // Constructor with name and age
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        rollNo = 0;
    }

    // Constructor with name, age and rollNo
    Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("-------------------");
    }
}

public class constructor_overload {
    public static void main(String[] args) {

        Student s1 = new Student();                     // Default
        Student s2 = new Student("Ali");                // Name only
        Student s3 = new Student("Sara", 20);           // Name and Age
        Student s4 = new Student("John", 22, 101);      // Name, Age, RollNo

        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}