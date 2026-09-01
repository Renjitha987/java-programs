import java.io.File;

public class FileExample {
    public static void main(String[] args) {

        File file = new File("sample.txt");

        System.out.println("File name: " + file.getName());
        System.out.println("File exists: " + file.exists());
    }
}