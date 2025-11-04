import java.util.Scanner;

public class OutPutUsingNestedLoo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][3];

        // Taking input
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Printing output
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " "); // ✅ Corrected
            }
            System.out.println(); // New line after each row
        }
    }
}
