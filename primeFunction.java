public class primeFunction {
    // public static boolean isPrime(int n){
    //     boolean isPrime = true;
    //     for(int i =2;i<=n-1; i++){
    //         if(n %i ==0){
    //             isPrime = false;
    //             break;

    //         }
    // }
    // return isPrime;

    // }
    public static boolean prime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }

    public static void primeInrange(int n){
        for(int i=2;i<=n;i++){
            if(prime(i)){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }
public static void main(String[] args) {
   System.out.println(prime(5));
   primeInrange(20);
}
}
