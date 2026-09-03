class Student implements Cloneable {

    int age = 20;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneDemo {
    public static void main(String[] args) {

        try {
            Student s1 = new Student();

            Student s2 = (Student) s1.clone();

            System.out.println("Original age: " + s1.age);
            System.out.println("Cloned age: " + s2.age);

            System.out.println("Are they the same object? " + (s1 == s2));

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning is not supported.");
        }
    }
}