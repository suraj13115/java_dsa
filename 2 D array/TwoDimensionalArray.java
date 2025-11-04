 public class TwoDimensionalArray{
 
 public static void print(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        System.out.println("Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 5, 4},
            {5, 6, 7, 8, 9},
            {9, 10, 11, 12, 13}
        };

        int m = arr.length, n = arr[0].length;
        print(arr);

        int minr = 0, maxr = m - 1;
        int minc = 0, maxc = n - 1;

        System.out.println("\nSpiral order:");

        while (minr <= maxr && minc <= maxc) {
            // top row
            for (int j = minc; j <= maxc; j++) {
                System.out.print(arr[minr][j] + " ");
            }
            minr++;

            // right column
            for (int i = minr; i <= maxr; i++) {
                System.out.print(arr[i][maxc] + " ");
            }
            maxc--;

            // bottom row
            if (minr <= maxr) {
                for (int j = maxc; j >= minc; j--) {
                    System.out.print(arr[maxr][j] + " ");
                }
                maxr--;
            }

            // left column
            if (minc <= maxc) {
                for (int i = maxr; i >= minr; i--) {
                    System.out.print(arr[i][minc] + " ");
                }
                minc++;
            }
        }
    }
}