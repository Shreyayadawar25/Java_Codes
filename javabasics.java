import java.util.Scanner;

public class javabasics{
  public static void main(String args[]){
    // System.out.println("Shreya");
    // System.out.println("Shreya");

    // System.out.print("Shreya\n");
    // System.out.print("Shreya\n");


    //variables

    // int a=10;
    // int b= 5;
    // System.out.println(a);
    // System.out.println(b);
    // String name = "Shreya";
    // System.out.println(name);
    // System.out.println("Sum="+(a+b));
    // System.out.println("Sum="+(a/b));

//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter two numbers");
//    int first = sc.nextInt();
//    int second = sc.nextInt();
//    System.out.println("Sum="+(first+second));
//    System.out.println("Diff="+(first-second));
//    System.out.println("Product="+(first*second));
//    System.out.println("Division="+(first/second));
//    System.out.println("Remainder="+(first%second));

//    for(int i=1;i<=10;i++){
//     System.out.println(first * i);
//    }

    
        Scanner scanner = new Scanner(System.in);

        // Taking 10 integer inputs from the user and storing them in an array
        int[] numbers = new int[10];
        System.out.println("Enter 10 integer numbers:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " +i  + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Asking user for a number
        System.out.print("Enter a number to search: ");
        int searchNumber = scanner.nextInt();

        // Checking if the number is present in the array
        boolean found = false;
        for (int number : numbers) {
            if (number == searchNumber) {
                found = true;
                break;
            }
        }

        // Displaying the result
        if (found) {
            System.out.println(searchNumber + " is present in the array.");
        } else {
            System.out.println(searchNumber + " is not present in the array.");
        }

        scanner.close();
    


  
  }
  }
  

