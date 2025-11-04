public class maxInArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,},{4,5,9},{4,8,6}};
        int mx=Integer.MIN_VALUE;
        int n=arr.length;
        int m=arr[0].length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mx = Math.max(mx,arr[i][j]);
                sum +=arr[i][j];
            }
            System.out.println(mx);
            System.out.println(sum);
            
        }
}
}