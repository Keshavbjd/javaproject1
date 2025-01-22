public class MathUtils {

    // Static method for calculating the square of a number
    public static double square(double num) {
        return num * num;
    }

    // Static method for calculating the cube of a number
    public static double cube(double num) {
        return num * num * num;
    }

    // Static method for calculating the factorial of a number
    public static long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // Static method for finding the maximum of two numbers
    public static double max(double num1, double num2) {
        return (num1 > num2) ? num1 : num2;
    }

    // Static method for finding the minimum of two numbers
    public static double min(double num1, double num2) {
        return (num1 < num2) ? num1 : num2;
    }

    // Main method to test the MathUtils class
    public static void main(String[] args) {
        double num1 = 5.0;
        double num2 = 3.0;
        int num3 = 6;

        // Using the static methods without creating an object
        System.out.println("Square of " + num1 + ": " + MathUtils.square(num1));
        System.out.println("Cube of " + num1 + ": " + MathUtils.cube(num1));
        System.out.println("Factorial of " + num3 + ": " + MathUtils.factorial(num3));
        System.out.println("Maximum of " + num1 + " and " + num2 + ": " + MathUtils.max(num1, num2));
        System.out.println("Minimum of " + num1 + " and " + num2 + ": " + MathUtils.min(num1, num2));
    }
}
