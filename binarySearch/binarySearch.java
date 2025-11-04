public class binarySearch {
    public static void main(String[] args){
        int[] arr = {2, 4, 5, 6, 7, 89, 90, 100};
        int n = arr.length;
        int target = 7;
        int li = 0;
        int hi = n - 1;
        boolean flag = false;

        while (li <= hi) {
            int mid = (hi + li) / 2;

            if (arr[mid] == target) {
                flag = true;
                break;
            } else if (arr[mid] > target) {
                hi = mid - 1;
            } else {
                li = mid + 1;  // ✅ fix: update li, not hi
            }
        }

        if (flag) {
            System.out.println("Target found");
        } else {
            System.out.println("Target not found");
        }
    }
}
