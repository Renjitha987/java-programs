class Student {
    int id;

    Student(int id) {
        this.id = id;
    }
}

public class TestHashCode {
    public static void main(String[] args) {

        Student s1 = new Student(101);
        Student s2 = new Student(102);
        Student s3 = new Student(103);

        System.out.println("Hash code of s1: " + s1.hashCode());
        System.out.println("Hash code of s2: " + s2.hashCode());
        System.out.println("Hash code of s3: " + s3.hashCode());

        // Another reference to s1
        Student anotherReference = s1;

        System.out.println(
                "Hash code of anotherReference: "
                        + anotherReference.hashCode()
        );

        System.out.println(
                "s1 and anotherReference have same hash code: "
                        + (s1.hashCode() == anotherReference.hashCode())
        );
    }
}