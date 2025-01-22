public class MatrixAddition {
    public static void main(String[] args) {
        // Define two 3x3 matrices
        int[][] matrix1 = {
            {1, 2, 3},
            {6, 7, 8},
            {2, 1, 3}
        };
        
        int[][] matrix2 = {
            {1, 2, 3},
            {6, 5, 2},
            {1, 1, 2}
        };
        
        // Result matrix to store the sum
        int[][] result = new int[3][3];
        
        // Perform matrix addition
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        // Display the result of matrix addition
        System.out.println("Result of matrix addition:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

