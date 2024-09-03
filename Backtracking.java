package DataStructure;
public class Backtracking {

    //change array and decrease by 2
    public static void changeArr(int arr[], int i, int val){
      //base case
        if(i == arr.length){
            printArr(arr);
            return;
        }

      //recursion
      arr[i] = val;
      changeArr(arr, i+1, val+1);
      arr[i] = arr[i] -2;


    }

    //find subset
    public static void findsubset(String str, String ans, int i){
        //base Case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.print("null");
            }else{
                System.out.println(ans);
            }
            
            return;
        }
        //recursion
        //yes choice
        findsubset(str, ans+str.charAt(i), i+1);
        //no choice
        findsubset(str, ans, i+1);
    }

    //permutation == arrangement
    public static void permutation(String str, String ans ){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        //recursion
        for(int i=0;i<str.length();i++){
            char cur = str.charAt(i);
           String Newstr = str.substring(0, i) + str.substring(i+1);
            permutation(Newstr, ans+cur);
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // int arr[] = new int[5];
        // changeArr(arr, 0, 1); 
        // printArr(arr);

        String str = "abc";
       //findsubset(str, "", 0);
        permutation(str, "");

    }
    
}
