public class Person {
    // Attributes (Fields)
    private String name;
    private int age;
    private String address;

    // Default constructor
    public Person() {
        this.name = "Unknown";    // Default value for name
        this.age = 0;             // Default value for age
        this.address = "Not Provided"; // Default value for address
    }

    // Method to display person information
    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating a Person object using the default constructor
        Person person = new Person();

        // Displaying default values
        person.displayPersonInfo();
    }
}
