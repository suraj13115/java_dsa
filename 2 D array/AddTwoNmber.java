public class AddTwoNmber {
    public static void main(String[] args) {
        
    
    int[][] a = {{10,20,30} , {34,34,34} , {88,34, 43}};
    int[][] b = {{44,4,5} , {43,34,23} , {4,6,7}};
    int m = a.length;
    int n = b[0].length;
    int[][] res = new int[m][n];
    for(int i = 0; i<m; i++){
        for(int j= 0; j<n;j++){
            res[i][j]= a[i][j] + b[i][j];
        }
    }
     for(int i = 0; i<m; i++){
        for(int j= 0; j<n;j++){
            res[i][j]= a[i][j] + b[i][j];
            System.out.print(res[i][j]+ " ");
        }
         System.out.println();
    }
}
}