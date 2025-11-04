public class maxarray {
    public static void main(String[] args) {
        int[] arr ={10,20,3,05,05,88,06,88,85} ;
       int n=arr.length;
       int mx=arr[0];
       for (int i = 0; i < n; i++) {
           if(arr[i]>mx) mx=arr[i];
       }
       System.out.println(mx);
    }
}
