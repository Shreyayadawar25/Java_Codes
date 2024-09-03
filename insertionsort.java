public class insertionsort {

//pick an element (from unsorted part) and place in the right position in sorted part
    public static void insertion(int arr[]){

        for(int i=1;i<arr.length;i++){
            int cur =arr[i];
            int prev=i-1;

            //finding out the correct pos to insert
            while(prev >=0 && arr[prev] > cur){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = cur;

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
        insertion(arr);
        printarr(arr);
    }
    }
    
    

