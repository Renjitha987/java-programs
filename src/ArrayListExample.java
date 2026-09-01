import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Anu");
        names.add("Rahul");
        names.add("Meera");

        System.out.println("Names: " + names);
        System.out.println("First name: " + names.get(0));
    }
}