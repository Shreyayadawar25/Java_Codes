import java.util.*;

public class ArrLargestNumber {

    public static int largest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity
        for (int i = 0; i < numbers.length; i++) {

            if (largest < numbers[i]) {

                largest = numbers[i];
            }
            if (smallest > numbers[i]) {

                smallest = numbers[i];
            }

        }
        System.out.println("Smallest no. is:" + smallest);
        System.out.println("Largest no. is:" + largest);
        return largest;
    }

    public static void main(String[] args) {

        int numbers[] = { 3, 2, 5, 7, 5, 9, 45, 7, 3 };
        System.out.println(largest(numbers));

    }

}
