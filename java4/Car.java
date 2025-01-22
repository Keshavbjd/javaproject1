public class Car {
    // Attributes (Fields)
    private String model;
    private int year;

    // Constructor with parameters
    public Car( String model, int year) {
       this.model = model;   // 'this.model' refers to the instance variable, while 'model' is the parameter
        this.year = year;     // 'this.year' refers to the instance variable, while 'year' is the parameter
    }

    // Default constructor using 'this()' for constructor chaining
    public Car() {
        this( "Unknown", 0); // Calling another constructor in the same class
    }

    // Method to display car details
    public void displayCarInfo() {
        
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating a Car object using the constructor with parameters
        Car car1 = new Car( "tesla model", 2020);
        car1.displayCarInfo();

        // Creating a Car object using the default constructor
        Car car2 = new Car();
        car2.displayCarInfo();
    }
}
