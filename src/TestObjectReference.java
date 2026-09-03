class Student {
}

public class TestObjectReference {
    public static void main(String[] args) {

        Object obj;

        // Student object
        obj = new Student();
        System.out.println(
                "Object type: " +
                        obj.getClass().getSimpleName()
        );

        // String object
        obj = "Hello";
        System.out.println(
                "Object type: " +
                        obj.getClass().getSimpleName()
        );

        // Integer object
        obj = Integer.valueOf(50);
        System.out.println(
                "Object type: " +
                        obj.getClass().getSimpleName()
        );
    }
}