

public class sortedArray {
    

    public static void main(String[] args) {
        int [] array = {5,3,6,7,9};
        int n = array.length;
        boolean flag = true;
        for(int i=0; i<n; i++){
   if(array[i] > array[i+1]){
    flag = false;
    break;
        }

    }
    if (flag == true) System.out.println("sorted");
else System.out.println("not sorted");
    
    }}
