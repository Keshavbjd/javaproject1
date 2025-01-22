import java.util.Scanner;

public class ShoppingCalculatorWithTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define tax rate
        double taxRate = 0.13;  // 13% tax rate

        // Ask for the price of one item
        System.out.print("Enter the price of one item: $");
        double pricePerItem = scanner.nextDouble();

        // Ask for the quantity of items
        System.out.print("How many items do you want to buy? ");
        int quantity = scanner.nextInt();

        // Calculate the total cost before tax
        double totalBeforeTax = pricePerItem * quantity;

        // Calculate tax amount
        double taxAmount = totalBeforeTax * taxRate;

        // Calculate the total cost including tax
        double totalCost = totalBeforeTax + taxAmount;

        // Display the results
        System.out.println("\n--- Shopping Summary ---");
        System.out.printf("Total before tax: $%.2f\n", totalBeforeTax);
        System.out.printf("Tax amount (13%%): $%.2f\n", taxAmount);
        System.out.printf("Total cost (including tax): $%.2f\n", totalCost);

        // Close the scanner
        scanner.close();
    }
}
