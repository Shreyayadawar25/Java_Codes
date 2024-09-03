public class FriendsPairingProblem {
    /*
     * given n friends, each one can remain single or can be paired up eith some other friend. 
     * each friend can be paired only once.
     * Find out the total no. of ways in
     * which friends can remain single or can be paired up.
     */


     public static  int pairing(int n){
        if(n==1 || n==2){
            return n;
        }
    //    int fp1 = pairing(n-1);
    //    int fp2 = pairing(n-2);
    //    int pairways = (n-1) * fp2;
    //    int totalways = fp1 + pairways;
    //    return totalways;
    return pairing(n-1 ) + (n-1) * pairing(n-2);
     }
    public static void main(String[] args) {
        System.out.println(pairing(3));
    }
    
}
