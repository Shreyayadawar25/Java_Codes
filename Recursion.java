import java.util.*;

public class Recursion {

    public static void printDec(int n) {

        if (n == 1) {
            System.out.print(1);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc(int n) {

        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");

    }

    public static int factorial(int n) {
        // if( n==0){
        // return 1;
        // }
        // int fn1 = factorial(n-1);
        // int fn =n * factorial(n-1);
        // return fn;

        if (n == 0 | n == 1) {
            return 1;
        } else {
            int fact = n * factorial(n - 1);
            return fact;
        }

    }

    public static int sumNaturalNumbar(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumNaturalNumbar(n - 1);
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // check if a given array is sorted or not.
    public static boolean sortArray(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return sortArray(arr, i + 1);

    }

    // find the first occurance of an element in an array.
    public static int firstoccurance(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstoccurance(arr, i + 1, key);

    }

    // find the last occurance of an element in an array.
    public static int lastoccurance(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        int isfound = lastoccurance(arr, i + 1, key);
        if (isfound == -1 && arr[i] == key) {
            return i;
        }

        return isfound;

    }

    // print x^n
    public static int printPower(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * printPower(x, n - 1);
        }
    }

    public static int optimizedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPowersq = optimizedPower(a, n / 2) * optimizedPower(a, n / 2);

        // n is odd
        if (n % 2 != 0) {
            halfPowersq = a * halfPowersq;
        }
        return halfPowersq;

    }

    public static void main(String[] args) {
        int n = 5;
        printDec(n);
         printInc(n);
        // System.out.println(factorial(n));
        // System.out.println(sumNaturalNumbar(n));
        // System.out.println(fibonacci(n));
        // int arr[] = {1,2,5,3,4 };
        // System.out.println(sortArray(arr, 0));
        // int arr[] = {8,3,6,9,5,10,2,5,3};
        // System.out.println(firstoccurance(arr, 0, 10));
        //  System.out.println(lastoccurance(arr, 0, 5));

        //  System.out.println(printPower(2, 10));
        //  System.out.println(optimizedPower(2, 5));
    }

}
