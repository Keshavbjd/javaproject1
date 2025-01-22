public class TypeCastingDemo {
    public static void main(String[] args) {
        // Widening Casting (Implicit)
        int intValue = 100;
        long longValue = intValue;  // int to long
        float floatValue = longValue;  // long to float
        
        System.out.println("Widening Casting:");
        System.out.println("Integer Value: " + intValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value: " + floatValue);

        // Narrowing Casting (Explicit)
        double doubleValue = 9.78;
        int narrowedIntValue = (int) doubleValue;  // double to int
        
        System.out.println("\nNarrowing Casting:");
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Narrowed Integer Value: " + narrowedIntValue);

      
    }
}
