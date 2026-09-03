class Student implements Cloneable {

    int mark;

    Student(int mark) {
        this.mark = mark;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class TestClone {
    public static void main(String[] args) {

        try {

            Student s1 = new Student(90);

            // Clone the object
            Student s2 = (Student) s1.clone();

            System.out.println("Before modification:");

            System.out.println("s1 mark: " + s1.mark);
            System.out.println("s2 mark: " + s2.mark);

            // Modify cloned object
            s2.mark = 95;

            System.out.println();

            System.out.println("After modifying cloned object:");

            System.out.println("s1 mark: " + s1.mark);
            System.out.println("s2 mark: " + s2.mark);

            System.out.println();

            System.out.println(
                    "Are s1 and s2 the same object? "
                            + (s1 == s2)
            );

        } catch (CloneNotSupportedException e) {

            System.out.println("Cloning not supported.");
        }
    }
}