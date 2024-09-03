public class BubbleSort {
    //Arrange the elements in increasing order

    public static void bubbleSort(int arr[]){

        for(int turn=0;turn<arr.length-1;turn++){
            int swap =0;
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
                System.out.println(swap+" ");
            }
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
        bubbleSort(arr);
        printarr(arr);
    }
    
}
