import java.util.*;

public class function {
    // public static void calculate(){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int sum = a+b;
    //     System.out.println("sum= "+sum);

    // }
    public static void calculate(int a, int b){
        
        int sum = a+b;
        System.out.println("sum= "+sum);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculate(a,b);
    }
    
}
