// Parent class
class Parent {
    // Final method that cannot be overridden by child classes
    public final void displayMessage() {
        System.out.println("This is final method the Parent class.");
    }

  
}

// Child class
class Child extends Parent {
  // @Override
   public void dispalyMassage(){
    System.out.println("thid method cannot override");
   }
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent child = new Child();

        // Calling the final method (cannot be overridden in the Child class)
        parent.displayMessage();  // Output: This is a message from the Parent class.
        child.displayMessage();   // Output: This is a message from the Parent class.

        // Calling the normal method (can be overridden in the Child class)
    }
}

