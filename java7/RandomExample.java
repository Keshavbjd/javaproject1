import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();

        // Generate a random integer (can be negative)
        int randomInt = random.nextInt();
        System.out.println("Random Integer: " + randomInt);

        // Generate a random integer within a specific range
        int randomIntInRange = random.nextInt(100); // Between 0 and 99
        System.out.println("Random Integer (0-99): " + randomIntInRange);
    }
}
