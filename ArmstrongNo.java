  public class ArmstrongNo {
    public static void main(String args[]){
        int low=1, high= 9999;
        for(int number = low+1;number < high;++number){
            if(checkArmstrong(number)){
                System.out.println(number+" ");
            }
        }
    }
    public static boolean checkArmstrong(int num){
        int digits = 0;
        int result = 0;
        int originalNnumber = num;
        while(originalNnumber != 0){
            originalNnumber /=10;
            ++digits;
        }
        originalNnumber = num;
        while (originalNnumber != 0) {
            int rem = originalNnumber % 10;
            result  += Math.pow(rem,digits);
            originalNnumber /= 10;
        }
        if (result == num) {
            return true;
        }
        return false;
    }


    
}
