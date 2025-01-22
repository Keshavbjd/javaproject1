public class Rectangle {
    // Attributes (Fields)
    private double length;
    private double width;

    // Constructor to initialize a rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to display the details of the rectangle
    public void displayDetails() {
        System.out.println("Length: " + length + ", Width: " + width + ", Area: " + calculateArea());
    }

    // Method that accepts a Rectangle object as an argument and compares its area with the current rectangle
    public void compareArea(Rectangle other) {
        if (this.calculateArea() > other.calculateArea()) {
            System.out.println("The current rectangle has a larger area.");
        } else if (this.calculateArea() < other.calculateArea()) {
            System.out.println("The other rectangle has a larger area.");
        } else {
            System.out.println("Both rectangles have the same area.");
        }
    }

    // Main method to test the passing of objects as arguments
    public static void main(String[] args) {
        // Creating two Rectangle objects
        Rectangle rect1 = new Rectangle(10.0, 5.0);  // Rectangle 1 with length 10 and width 5
        Rectangle rect2 = new Rectangle(8.0, 6.0);   // Rectangle 2 with length 8 and width 6

        // Displaying details of both rectangles
        System.out.println("Rectangle 1:");
        rect1.displayDetails();
        System.out.println("\nRectangle 2:");
        rect2.displayDetails();

        // Comparing the areas of the two rectangles by passing objects
        System.out.println("\nComparing Areas:");
        rect1.compareArea(rect2);
    }
}
