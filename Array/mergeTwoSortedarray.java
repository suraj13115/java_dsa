public class mergeTwoSortedarray {
 public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        int[] b = {11, 23, 44, 55};
        int[] c = new int[a.length + b.length];
        
        int i = 0, j = 0, k = 0;

  
        while(i < a.length && j < b.length) {
            if(a[i] <= b[j]) {
                c[k] = a[i];
                i++; k++;
            } else {
                c[k] = b[j];
                j++; k++;
            }
        }

        // Copy remaining elements of a[]
        while(i < a.length) {
            c[k] = a[i];
            i++; k++;
        }

        // Copy remaining elements of b[]
        while(j < b.length) {
            c[k] = b[j];
            j++; k++;
        }

        // Print merged array
        for(int ele : c) {
            System.out.print(ele + " ");
        }
    }
}
