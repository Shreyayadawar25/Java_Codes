public class MAXSubArray {

    public static void subArray(int numbers[]) {

        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                curSum = 0;
                for (int k = start; k <= end; k++) {
                    curSum += numbers[k];
                }
                System.out.println(curSum);
                if (maxSum < curSum) {
                    maxSum = curSum;
                }
            }
        }
        System.out.println("Max Sum = " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        subArray(numbers);
    }

}
