public class lowerBond {
    public static void main(String[] args){
        int[] arr = {2, 4, 5, 6, 7, 89, 90, 100};
        int n = arr.length;
        int target =100;
        int lb=n;
        int li=0;
        int hi=n-1;
        while(li<=hi){
            int mid=(hi+li)/2;
               if(arr[mid]>=target){
                lb=Math.min(lb,mid);
                hi=mid-1;
               }
else    
    li=mid+1;

        }
        System.out.println(lb);
    }}