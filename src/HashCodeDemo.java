class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
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

public class HashCodeDemo {
    public static void main(String[] args) {

        Student s1 = new Student("Robins");
        Student s2 = new Student("Robins");

        System.out.println("HashCode of s1: " + s1.hashCode());
        System.out.println("HashCode of s2: " + s2.hashCode());

        System.out.println("Objects equal: " + s1.equals(s2));
    }
}