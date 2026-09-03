class Student {
}

public class GetClassDemo {
    public static void main(String[] args) {

        Student s = new Student();

        System.out.println("Class information: " + s.getClass());
        System.out.println("Class name: " + s.getClass().getName());
    }
}