public class LargestElement {
    public static void main(String[] args) {
        // Initialize an array
        int[] numbers = {45, 7, 23, 6, 8,9};

        // Assume the first element is the largest
        int largest = numbers[0];

        // Iterate through the array to find the largest element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        // Display the largest element
        System.out.println("The largest element in the array is: " + largest);
    }
}
