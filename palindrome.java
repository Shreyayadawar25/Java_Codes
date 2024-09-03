public class palindrome {

    //noon , madam, racecar

    public static boolean palindrome(String str){
        str = str.replaceAll("\\s+", "").toLowerCase();
        for(int i=0;i<=str.length()/2;i++){
           if(str.charAt(i)==str.charAt(str.length()-1-i)){
            return true;
           }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "Race Car";
        System.out.println(palindrome(str));
    }
    
}
