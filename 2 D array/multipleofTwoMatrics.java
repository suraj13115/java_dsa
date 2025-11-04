public class multipleofTwoMatrics {
    public static void main(String[] args) {
        int[][] a ={{1,2,3},
                      {4,5,6}};
             int[][] b = {{1,5,1,2},{2,3,5,5},{4,6,8,7}}  ;  
             if(a[0].length !=b.length){
                System.out.println("Invalid input");
                
             }
             else{
                int[][] c = new int[a.length][b[0].length];
                for(int i=0; i<c.length; i++){
                        for(int j=0; j<c[0].length; j++){
                            c[i][j] = 0;
                            for(int k=0; k<b.length; k++){
                                c[i][j] += a[i][k] * b[k][j];
                            }
                            System.out.print(c[i][j] + " ");
                        }
                        System.out.println();
                    }
                }
                
             }   
    }

