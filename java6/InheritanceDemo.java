// Superclass: Vehicle
class Vehicle {
    // Fields (Attributes)
    private String brand;
    private int year;

    // Constructor to initialize Vehicle attributes
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method to display the vehicle's details
    public void displayDetails() {
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Vehicle Year: " + year);
    }
}

// Subclass: Car (inherits from Vehicle)
class Car extends Vehicle {
    // Additional attribute specific to Car
    private int doors;

    // Constructor to initialize Car attributes, using the super() to call Vehicle's constructor
    public Car(String brand, int year, int doors) {
        super(brand, year);  // Call the superclass (Vehicle) constructor
        this.doors = doors;
    }

    // Method to display car-specific details
    public void displayCarDetails() {
        // Call the displayDetails method from the Vehicle class
        displayDetails();
        System.out.println("Number of Doors: " + doors);
    }
}

// Main class to test single inheritance
public class InheritanceDemo {
    public static void main(String[] args) {
        // Creating an object of Car (which inherits from Vehicle)
        Car myCar = new Car("Toyota", 2020, 4);

        // Displaying the details of the Car
        myCar.displayCarDetails();
    }
}
