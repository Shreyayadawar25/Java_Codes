import java.util.*;

public class matrices {

public static boolean search(int matrix[][], int key){
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j] == key){
                System.out.println("found at cell ("+i+","+j+")");
                return true;
            }

        }
        
     }
     return false;

}
    public static void main(String[] args) {
         int matrix[][]= new int[3][3];

         int n=3; //n=matrix.length;
         int m=3;  //m=matrix[0].length
         Scanner sc = new Scanner(System.in);
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();

            }
         }

         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
         }
         search(matrix, 5);


         for (int x = 0; x < n; x++) {
            int maxm = matrix[0][x];
            for (int y = 1; y < m; y++) {
               if (matrix[y][x] > maxm) {
                  maxm = matrix[y][x];
               }
            }
            System.out.println("The largest element in column " + (x+1) + " is " + maxm);
         }

         for (int x = 0; x < n; x++) {
            int minm = matrix[0][x];
            for (int y = 1; y < m; y++) {
               if (matrix[y][x] < minm) {
                  minm = matrix[y][x];
               }
            }
            System.out.println("The smallest element in column " + (x+1) + " is " + minm);
         }

    }
    
    
}
