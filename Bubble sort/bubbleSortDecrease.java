public class bubbleSortDecrease {
    public static void print(int [] array){
        for(int ele: array){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[] ={3,6,45,6,3,63,6,42,};
        int n = array.length;
        print(array);
        for(int x=0;x<n-1;x++){
        for(int i=0;i<n-x-1;i++){
            if(array[i]<array[i+1]){
                int temp =array[i];
                array[i]=array[i+1];
                array[i+1]=temp;
            }}

        }
        print(array);
    }
}
