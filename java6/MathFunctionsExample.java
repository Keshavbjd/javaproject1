public class MathFunctionsExample {
    public static void main(String[] args) {
        // Absolute value of a number
        int num1 = -5;
        double absValue = Math.abs(num1);
        System.out.println("Absolute value of " + num1 + ": " + absValue);

        // Square root of a number
        double num2 = 16;
        double squareRoot = Math.sqrt(num2);
        System.out.println("Square root of " + num2 + ": " + squareRoot);

        // Power of a number (e.g., 2^3)
        double base = 2;
        double exponent = 3;
        double power = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + ": " + power);

    }
}
