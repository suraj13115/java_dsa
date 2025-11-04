public class greates{
    public static void main(String[] args) {
        int[] arr = {10, 12, 43, 54, 53, 23, 23};
        int n = arr.length;
        int[] ans = new int[n];
        ans[n - 1] = -1; // last element always has no right element

        for (int i = 0; i < n - 1; i++) {
            int mx = -1;
            for (int j = i + 1; j < n; j++) {
                mx = Math.max(mx, arr[j]);
            }
            ans[i] = mx;
        }

        // Print original array
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        // Print answer array
        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }
}
