public class TillingProblem {
    public static int tile(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int verticalTile = tile(n-1);
        int horizontalTile = tile(n-2);
        int totalways = verticalTile + horizontalTile;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(tile(4));
    }
    
}
