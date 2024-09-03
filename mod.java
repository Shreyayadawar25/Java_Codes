import java.util.*;

public class mod {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int size = s.nextInt();
        int[] myArray = new int[size];
        
        System.out.println("Enter the elements of the array one by one ");
        for (int i = 0; i < size; i++) {
            myArray[i] = s.nextInt();
        }

        int[] dp = new int[N];
        Arrays.fill(dp, -1);
        dp[1] = 0;

        for (int i = 0; i < size; i++) {
            int[] temp = dp.clone();
            for (int j = 0; j < N; j++) {
                if (dp[j] != -1) {
                    int newRemainder = (j * myArray[i]) % N;
                    temp[newRemainder] = Math.max(temp[newRemainder], dp[j] + 1);
                }
            }
            dp = temp;
        }

        if (dp[1] == -1) {
            System.out.println("No subset with product congruent to 1 modulo " + N);
        } else {
            System.out.println("Length of the largest subset with product congruent to 1 modulo " + N + " is: " + dp[1]);
        }
    }
}
