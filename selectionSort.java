public class selectionSort {

//pick the smallest (from unsorted) put it in the beginning.

public static void selection(int arr[]){

    for(int i=0;i<=arr.length-1;i++){
        int minPos=i;
        for(int j=i+1;j<arr.length;j++){

            if(arr[minPos] > arr[j]){
                minPos =j;
            }
        }

        int temp = arr[minPos];
        arr[minPos]= arr[i];
        arr[i] =temp;
    }


}
public static void printarr(int arr[]){
    for(int j=0;j<arr.length;j++){
        System.out.print(arr[j]+" ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        int arr[] = { 5,4,1,3,2};
        selection(arr);
        printarr(arr);
    }
    }
    

