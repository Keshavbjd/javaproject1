// Base class marked as final
final class BaseClass {
    // Attributes
    private String message;

    // Constructor
    public BaseClass(String message) {
        this.message = message;
    }

    // Method to display message
    public void displayMessage() {
        System.out.println("Message from BaseClass: " + message);
    }
}

// This will cause a compile-time error because BaseClass is final and cannot be inherited
// class DerivedClass extends BaseClass {
//     // Error: Cannot subclass a final class
// }

public class FinalClassExample {
    public static void main(String[] args) {
        // Creating an instance of BaseClass
        BaseClass base = new BaseClass("Hello from BaseClass!");
        base.displayMessage();
        
        // Trying to create a DerivedClass will result in a compile-time error:
        // DerivedClass derived = new DerivedClass();
    }
}

