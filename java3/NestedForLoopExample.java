public class NestedForLoopExample {
    public static void main(String[] args) {
        // Outer loop for rows
        for (int i = 1; i <= 5; i++) {
            // Inner loop for columns
            for (int j = 1; j <= 5; j++) {
                System.out.println("*"); // Print the product of i and j
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
