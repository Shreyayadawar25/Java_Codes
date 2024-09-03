import java.util.ArrayList;
import java.util.Scanner;

public class SwapArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // ArrayList<Integer> even = new ArrayList<>();
        // ArrayList<Integer> odd= new ArrayList<>();

        
        // for (int i = 0; i < n; i++) {
        //     if (arr[i] % 2 == 0) {
        //         even.add(i);
        //     } else {
        //         odd.add(i);
        //     }
        // }

        
        // int evenSwaps = 0;
        // for (int i = 0; i < even.size(); i++) {
        //     evenSwaps += even.get(i) - i;
        // }

    
        // int oddSwaps = 0;
        // for (int i = 0; i < odd.size(); i++) {
        //     oddSwaps += odd.get(i) - i;
        // }


        // int minSwaps = Math.min(evenSwaps, oddSwaps);

        // System.out.println(minSwaps);


        // Two-pointer approach
        int left = 0;
        int right = n - 1;
        int swapCount = 0;
        while (left < right) {
            // Increment left pointer until it finds an odd number
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }
            // Decrement right pointer until it finds an even number
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }
            // Swap the elements
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // Print the count of swaps
        System.out.println("Number of swaps: " + swapCount);
    }
}