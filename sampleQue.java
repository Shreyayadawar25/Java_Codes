import java.util.*;
public class sampleQue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // Number of villains
        int M = scanner.nextInt(); // Number of heroes
        int H = scanner.nextInt(); // Health of each hero

        int[] villains = new int[N];
        for (int i = 0; i < N; i++) {
            villains[i] = scanner.nextInt();
        }

        int result = minVillainsToRemove(N, M, H, villains);
        System.out.println(result);
    }

    public static int minVillainsToRemove(int N, int M, int H, int[] villains) {
        int minVillainsToRemove = 0;
        int heroIndex = 0;

        // Iterate through the villains
        for (int villain : villains) {
            // If there are no more heroes left or all heroes are defeated
            if (heroIndex == M || H <= 0) {
                break;
            }

            // Battle between hero and villain
            if (H > villain) {
                // Hero wins, decrement health by villain's health
                H -= villain;
                heroIndex++;
            } else if (H == villain) {
                // Both defeated, move to the next hero
                heroIndex++;
            } else {
                // Hero loses, need to remove villains from the front
                minVillainsToRemove++;
            }
        }

        return minVillainsToRemove;
    }
}