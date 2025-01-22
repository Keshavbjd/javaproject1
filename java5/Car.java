public class Car {
    // Attributes (Fields)
     private String model;
    private int year;
    private double price;

    // Parameterized constructor
    public Car( String model, int year, double price) {
           // Assigning the value passed to the constructor to the instance variable
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Method to display car details
    public void displayCarInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("Car Price: $" + price);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating Car objects using the parameterized constructor
        Car car1 = new Car( "tesla", 2020, 7000000.00);
      

        // Displaying details of both cars
        car1.displayCarInfo();
        
    }
}
