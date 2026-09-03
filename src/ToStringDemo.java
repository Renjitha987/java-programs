class Student {
    String name = "Robins";

    @Override
    public String toString() {
        return "Student Name : " + name;
    }
}

public class ToStringDemo {
    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s);
        System.out.println(s.toString());
    }
}