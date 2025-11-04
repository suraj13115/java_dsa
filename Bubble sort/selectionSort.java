public class selectionSort {
    public static void print(int [] array){
        for(int ele:array){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        int arr[] = {3,1,4,6,88,3};
        int n =arr.length;
        print(arr);
       for(int i = 0; i<n-1;i++){
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for(int j= i;j<n; j++){
            if(arr[j]<min){
                min = arr[j];
                minIndex = j;

            }
        }
        int temp= arr[i];
        arr[i]= arr[minIndex];
        arr[minIndex]= temp;    
       }
       print(arr);
    }
}
