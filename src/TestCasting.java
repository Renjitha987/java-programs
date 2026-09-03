class Student {

    void display() {
        System.out.println("Student Display");
    }
}

public class TestCasting {
    public static void main(String[] args) {

        // Student object stored in Object reference
        Object obj = new Student();

        // Cannot do this:
        // obj.display();

        // Downcasting
        Student s = (Student) obj;

        // Now Student method can be accessed
        s.display();
    }
}