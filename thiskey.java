class Student {
    int rollNo;
    String name;

    // Constructor
    Student(int rollNo, String name) {
        this.rollNo = rollNo;   // Refers to current class variable
        this.name = name;       // Refers to current class variable
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

public class thiskey {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Ali");
        s1.display();
    }
}