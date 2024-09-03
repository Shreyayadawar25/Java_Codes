import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static boolean pairSum(ArrayList<Integer> list, int target) {

        //find if any pair in a sorted arraylist has a target sum. Array should be sorted.

        // Brute force -- O(n*2)
        for(int i=0;i<list.size();i++){
        for(int j=i+1;j<list.size();j++){
        if(list.get(i) + list.get(j) == target){
        return true;
        }
        }
        }
        return false;

        // 2Pointer approach

        // int lp = 0;
        // int rp = list.size() - 1;
        // while (lp != rp) {
        //     // case1
        //     if (list.get(lp) + list.get(rp) == target) {
        //         return true;
        //     }
        //     // case2
        //     if (list.get(lp) + list.get(rp) < target) {
        //         lp++;
        //     }
        //     // case3
        //     if (list.get(lp) + list.get(rp) > target) {
        //         rp--;
        //     }
        // }
        // return false;
    }
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        //find if any pair in a sorted and rotated arraylist has a target sum.
       //2 pointer approach
       int bp = -1;
       for(int i=0;i<list.size();i++){
        if(list.get(i) > list.get(i+1)){
            //breaking point
            bp=1;
            break;
        }
       }
       int lp = bp+1;//smallest
       int rp = bp;//largest
        int n = list.size();
        while (lp != rp) {
            // case1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // case2
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp+1)%n;
            }
            // case3
            if (list.get(lp) + list.get(rp) > target) {
                rp=(n+rp-1)%n;
            }
        }
        return false;



    }
    public static int largestTwoDigit(ArrayList<Integer> list ){
        if (list.size() < 2) {
            System.out.println("Please enter at least two elements.");
            return 0;
        }
        Collections.sort(list);
        
        int largest = list.get(list.size() - 1);
        int secondLargest = list.get(list.size() - 2);
        System.out.println(largest);
        System.out.println(secondLargest);
        return largest + secondLargest;
    }

    public static void main(String[] args) {

        // classname objectname = new classname();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // add operation=====0(1)
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(11);

        //list.add(1, 9); // o(n)
        //System.out.println(list);

        // get operation======o(1)
        // int element = list.get(2);
        // System.out.println(element);

        // remove element====o(n)
        // list.remove(2);
        // System.out.println(list);

        //set element at index //====o(n)
        // list.set(2, 10);
        // System.out.println(list);

        // contains element ====o(n)
        //System.out.println(list.contains(1));
        //System.out.println(list.contains(11));

        // size of arraylist
        // System.out.println(list.size());
        // for (int i = 0; i < list.size(); i++) {
        // System.out.println(list.get(i)+" ");
        // }

        // System.out.println();

        // reverse order of arraylist
        // for(int i=list.size()-1;i>=0;i--){
        // System.out.print(list.get(i)+ " ");
        // }
        // System.out.println();

        // MAXIMUM OF ARRAYLIST-----o(n)
        // list.add(2);
        // list.add(5);
        // list.add(9);
        // list.add(6);
        // list.add(8);

        // int MAX = Integer.MIN_VALUE;
        // for (int i = 0; i < list.size(); i++) {
        // if(MAX < list.get(i)){
        // MAX = list.get(i);
        // }

        // }
        //  System.out.println("Maximum no.="+MAX);

        // // swapping
        // list.add(2);
        // list.add(5);
        // list.add(9);
        // list.add(3);
        // list.add(6);
        // System.out.println(list);
        // int idx1=1, idx2=3;
        // swap(list,idx1,idx2);
        // System.out.println(list);
        // Collections.sort(list); //ascending
        // System.out.println(list);
        // Collections.sort(list, Collections.reverseOrder()); //descending order
        // System.out.println(list);

        // pair sum problem
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // list.add(6);
        // int target = 5;
        // System.out.println(pairSum(list, target));

        // pairSum 2 problem
        // list.add(11);
        // list.add(15);
        // list.add(6);
        // list.add(8);
        // list.add(9);
        // list.add(10);
        
        // int target = 16;
        // System.out.println(pairSum2(list, target));

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        int result = largestTwoDigit(list);
        System.out.println("Sum of the two largest elements: " + result);

    }
}
