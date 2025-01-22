public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            // Trying to access an index that doesn't exist
            System.out.println("Element at index 10: " + numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception
            System.out.println("Error: Index out of bounds!");
            e.printStackTrace();  // Optional: Print the stack trace for debugging
        }

        System.out.println("Program continues after the exception.");
    }
}
