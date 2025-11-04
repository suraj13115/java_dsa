import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();       // size of array
        int[] arr = new int[n];     // declare array

        // input elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // print elements less than 35
        for (int i = 0; i < n; i++) {
            if (arr[i] < 35) {
                System.out.println(arr[i]);  // ✅ print element
            }
        }
    }
}
