import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {

        Random dice = new Random();

        int roll = dice.nextInt(6) + 1;

        System.out.println("You rolled: " + roll);
    }
}