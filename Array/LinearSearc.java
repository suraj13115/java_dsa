import java.util.Scanner;

public class LinearSearc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array ka size lena
        System.out.println("Enter the array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Array ke elements lena
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Search karne wala element lena
        System.out.println("Enter the element to search:");
        int x = sc.nextInt();

        // Linear Search
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println("Element found at index " + i);
                found = true;
                break; // ek baar mil gaya to loop rok do
            }
        }

        if (!found) {
            System.out.println("Element not found in the array");
        }
    }
}
