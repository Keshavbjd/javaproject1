package mypackage;  // Define the package

public class Greeting {
    // A simple method to display a greeting message
    public void sayHello() {
        System.out.println("Hello from mypackage!");
    }
}
import mypackage.Greeting;  // Import the Greeting class from the mypackage package

public class MainProgram {
    public static void main(String[] args) {
        // Create an object of the Greeting class
        Greeting greeting = new Greeting();
        
        // Call the sayHello method
        greeting.sayHello();
    }
}
