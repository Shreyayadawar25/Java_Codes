public class BinomialFunction {

    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
             f=f*i;
        } 
        return f;

    }
    public static int binomial(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nr = factorial(n-r);

         int bin = fact_n/(fact_r*fact_nr);
         return bin;


    }
    public static void main(String[] args) {
        int b =  binomial(5, 2);
        System.out.println(b);
        
    }
}
