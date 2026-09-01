import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class PrintWriterExample {
    public static void main(String[] args) {

        try {
            PrintWriter writer = new PrintWriter("output.txt");

            writer.println("Hello Java!");
            writer.println("This file was created using PrintWriter.");

            writer.close();

            System.out.println("Data written successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}