public class bubbleSort {


    public static void print(int [] array){
        for(int ele:array){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){

        int [] array = {5,10,6,1,5};
        int n = array.length;
        print(array);
        // for(int x=0;x<n-1;x++){
        // for(int i=0;i<n-1;i++){
        //     if(array[i]>array[i+1]){
        //         int temp =array[i];
        //         array[i]=array[i+1];
        //         array[i+1]=temp;
        //     }}

        // }
        // for(int x=0;x<n-1;x++){
        //     for(int i=0;i<n-1-x;i++){
        //         if(array[i]>array[i+1]){
        //             int temp =array[i];
        //             array[i]=array[i+1];
        //             array[i+1]=temp;
        //         }}
    
        //     }
        for(int x=0;x<n-1;x++){
            for(int i=0;i<n-1;i++){
                if(array[i]>array[i+1]){
                    int temp =array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                }}
                // if check this part is sorted or not

    boolean flag = true;
    for(int i= 0; i<n-1-x;i++){

if (array[i]>array[i+1]){
    flag = false;
    break;
}
    }
    flag=true;
break;            }
        print(array);
    }
}
