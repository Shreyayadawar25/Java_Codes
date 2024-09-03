import java.util.Arrays;
import java.util.Collections;

public class InbulitArray {
    public static void printarr(Integer arr[]){
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       // int arr[] = { 5,4,1,3,2};
        //Arrays.sort(arr);
        //Arrays.sort(arr,0,3);

      Integer arr[] = { 5,4,1,3,2};
      Arrays.sort(arr);
        //Arrays.sort(arr,Collections.reverseOrder());   //reverse order
        printarr(arr);
    }
    }

