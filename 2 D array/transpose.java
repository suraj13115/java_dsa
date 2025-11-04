public class transpose {
    public static void main(String[] args) {
        int[][] arr = {{3,5},{6,5},{8,9}};
        int m=arr.length;
        int n = arr[0].length;
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print(arr[i][j]+" ");
        //         transpose[j][i]=arr[i][j];
            // // }
            // System.out.println();

            int[][] transpose = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    transpose[i][j] =arr[j][i]; 
                    System.out.print(transpose[i][j]+" ");
                    
                }
                System.out.println();
            }
        }
    }

