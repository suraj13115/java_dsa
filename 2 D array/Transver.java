public class Transver {
    public static void main(String[] args) {

        // 2D array with 3 rows and 2 columns
        int[][] arr = {{1,2},{4,5},{6,7}};
        
        // m = number of rows, n = number of columns
        int m = arr.length;       // 3
        int n = arr[0].length;    // 2

        // Loop through columns first (transpose style)
        for (int j = 0; j < n; j++) {      // column loop
            for (int i = 0; i < m; i++) {  // row loop
                // Print element at row i and column j
                System.out.print(arr[i][j] + " ");
            }
            // New line after finishing one column
            System.out.println();
        }
    }
}
