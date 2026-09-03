class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Student other = (Student) obj;

        return name.equals(other.name);
    }
}

public class EqualsDemo {
    public static void main(String[] args) {

        Student s1 = new Student("Robins");
        Student s2 = new Student("Robins");

        System.out.println("s1.equals(s2): " + s1.equals(s2));
    }
}