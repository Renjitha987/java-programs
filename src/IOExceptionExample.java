import java.io.IOException;

public class IOExceptionExample {
    public static void main(String[] args) {

        try {
            throw new IOException("Example IOException");
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}