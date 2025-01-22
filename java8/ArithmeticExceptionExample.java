public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempt to divide by zero
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // Optional: Code that will always execute
            System.out.println("Operation complete.");
        }
    }
}
