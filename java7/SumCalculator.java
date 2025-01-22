import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of inputs they will provide
        System.out.print("How many numbers would you like to sum? ");
        int count = scanner.nextInt();  // Read the number of values

        // Initialize the sum variable
        int sum = 0;

        // Loop to read the numbers and calculate the sum
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();  // Read each number
            sum += number;  // Add the number to the sum
        }

        // Output the result
        System.out.println("The sum of the numbers is: " + sum);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
