import java.util.*;

public class HeroVillain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); 
        int m = scanner.nextInt(); 
        int H = scanner.nextInt(); 

        int[] villains = new int[n];
        for (int i = 0; i < n; i++) {
            villains[i] = scanner.nextInt();
        }

        int removevictory = 0;

        while (removevictory < n) {
            int currHeroes = m;
            int currHealth = H;
            boolean victory = true;

            for (int i = removevictory; i < n; i++) {
                if (currHeroes == 0) {
                    victory = false;
                    break;
                }
                if (currHealth > villains[i]) {
                    currHealth -= villains[i];
                } else if (currHealth < villains[i]) {
                    currHeroes--;
                    currHealth = H;
                } else {
                    currHeroes--;
                    currHealth = H;
                }
            }

            if (victory && currHeroes > 0) {
                break;
            }

            removevictory++;
        }

        System.out.println(removevictory);
        scanner.close();
        
    }
}
