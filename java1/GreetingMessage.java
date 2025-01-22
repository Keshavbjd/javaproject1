import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Print a personalized greeting message
        System.out.println("Hello, " + name + "! Welcome to Java programming!");

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
