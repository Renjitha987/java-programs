class Student {
    int rollNo;
    String name;
    String course;

    Student(int rollNo, String name, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Roll No : " + rollNo +
                ", Name : " + name +
                ", Course : " + course;
    }
}

public class TestToString {
    public static void main(String[] args) {

        Student s = new Student(101, "Alice", "Computer Science");

        // Printing object directly
        System.out.println(s);

        // Calling toString() explicitly
        System.out.println(s.toString());
    }
}