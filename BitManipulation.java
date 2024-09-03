import java.util.*;


public class BitManipulation {

    public static int getIthBit(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int setIthBit(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static int clearIthBit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int updateIthBit(int n, int i,int newBit){
      if(newBit ==0){
        return clearIthBit(n, i);

      }else{
        return setIthBit(n,i);
      }
    }

    public static int clearLastIBit(int n, int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
      }

      public static int clearRangeIBit(int n, int i,int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i) - 1;
        int bitmask = a | b;
        return n & bitmask;
      }

      public static void oddeven(int n){
//odd = LSB=1
//even = LSB = 0  
        int bitmask =1;
        if((n & bitmask) ==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

    }
   

    public static void main(String[] args) {
        System.out.println(5 & 6);
        System.out.println(5 | 6);
        System.out.println(5 ^ 6);
        System.out.println((~5)); 
        System.out.println(5 << 2);
        System.out.println(6 >> 1);

        System.out.println(getIthBit(10, 3));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10, 2,1));
        System.out.println(clearLastIBit(15, 2));
       System.out.println(clearRangeIBit(10, 2,4));
        oddeven(7);
        oddeven(4);
    }
    
}
