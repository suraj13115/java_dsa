
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 30;
        // arr[3] = 40;
        // arr[4] = 50;
      for (int i = 0; i <= n-1; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i <= n-1; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
