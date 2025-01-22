public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            // Code that may throw multiple exceptions
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
            int result = 10 / 0;           // ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle ArrayIndexOutOfBoundsException
            System.out.println("Error: Array index is out of bounds.");
        } catch (ArithmeticException e) {
            // Handle ArithmeticException
            System.out.println("Error: Division by zero.");
        } catch (Exception e) {
            // Handle all other exceptions
            System.out.println("Error: An unexpected exception occurred.");
        }

        System.out.println("Program continues...");
    }
}
