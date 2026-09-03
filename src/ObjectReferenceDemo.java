class Student {

    void display() {
        System.out.println("Student display method");
    }
}

public class ObjectReferenceDemo {
    public static void main(String[] args) {

        Object obj;

        obj = "Hello Java";
        System.out.println(obj);

        obj = Integer.valueOf(25);
        System.out.println(obj);

        obj = new Student();

        System.out.println("Object class: " + obj.getClass());

        // Type casting
        Student s = (Student) obj;

        s.display();
    }
}