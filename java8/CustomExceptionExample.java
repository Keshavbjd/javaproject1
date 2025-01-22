// Custom exception extending Exception (checked exception)
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message); // Pass the message to the parent Exception class
    }
}
public class CustomExceptionExample {
    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18.");
        }
        System.out.println("Age is valid.");
    }

    public static void main(String[] args) {
        try {
            // Test with an invalid age
            validateAge(15);
        } catch (InvalidAgeException e) {
            // Handle the custom exception
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
