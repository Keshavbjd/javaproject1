public class TryCatchFinallyExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            // Attempt to access an invalid index
            System.out.println("Accessing element: " + numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception
            System.out.println("Error: Index is out of bounds. " + e.getMessage());
        } finally {
            // Always executed
            System.out.println("Execution in the finally block.");
        }

        System.out.println("Program continues...");
    }
}
