class Student {
}

class Employee {
}

class Book {
}

public class TestGetClass {
    public static void main(String[] args) {

        Student student = new Student();
        Employee employee = new Employee();
        Book book = new Book();

        System.out.println("Student class: " + student.getClass());
        System.out.println(
                "Student simple name: " +
                        student.getClass().getSimpleName()
        );

        System.out.println();

        System.out.println("Employee class: " + employee.getClass());
        System.out.println(
                "Employee simple name: " +
                        employee.getClass().getSimpleName()
        );

        System.out.println();

        System.out.println("Book class: " + book.getClass());
        System.out.println(
                "Book simple name: " +
                        book.getClass().getSimpleName()
        );
    }
}