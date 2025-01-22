// Shape class to calculate the area of shapes
public class Shape {
    
    // Method to calculate the area of a circle
    public double calculateCircleArea(double radius) {
        return Math.PI * radius * radius; // Formula: πr²
    }

    // Method to calculate the area of a rectangle
    public double calculateRectangleArea(double length, double width) {
        return length * width; // Formula: length * width
    }

    // Main method to test the area calculations
    public static void main(String[] args) {
        Shape shape = new Shape();  // Create an instance of the Shape class

        // Calculate and display the area of a circle with radius 5
        double circleArea = shape.calculateCircleArea(5);
        System.out.println("Area of the circle: " + circleArea);

        // Calculate and display the area of a rectangle with length 10 and width 4
        double rectangleArea = shape.calculateRectangleArea(10, 4);
        System.out.println("Area of the rectangle: " + rectangleArea);
    }
}
