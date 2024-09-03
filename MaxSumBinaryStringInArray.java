/*Given an array of T length each Index contain array of two binary strings , your task is to return their maximum sum (also a binary string).
 First Line contain T array length , Next n lines contain two string which shows binary space separated m,n
 find the sum of m and n in binary and print the maximum binary sum from the array elements 
 INPUT
 3
 101 100
 110 10
 1000 11
 
 OUTPUT
 1011
 
 */

 import java.util.*;

public class MaxSumBinaryStringInArray {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Read the number of pairs
    int T = scanner.nextInt();
    scanner.nextLine(); // Consume the remaining newline
    
    String maxBinarySum = "";
    int maxSum = 0;
    
    // Iterate over each pair
    for (int i = 0; i < T; i++) {
        // Read the binary strings
        String m = scanner.next(); //1st pair
        String n = scanner.next();  //2nd pair
        
        // Convert binary strings to integers
        int decimalM = Integer.parseInt(m, 2);
        int decimalN = Integer.parseInt(n, 2);
        
        // Calculate the sum
        int decimalSum = decimalM + decimalN;
        
        // Convert the sum back to a binary string
        String binarySum = Integer.toBinaryString(decimalSum);
        
        // Check if this is the maximum sum encountered so far
        if (decimalSum > maxSum) {
            maxSum = decimalSum;
            maxBinarySum = binarySum;
        }
    }
    
    // Print the maximum binary sum
    System.out.println(maxBinarySum);
    
    scanner.close();
}
    
}