import java.util.*;

public class Strings {
    public static void main(String[] args) {
        // char arr[] = {'a','b','c','d','e'};
        // String str="abcd";
        // String strr = new String("xyz");

        // //String are immutable(cannot change)
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        // equals function

        // String s1 = "Shreya";
        // String s2 = "Shreya";
        // String s3 = new String("Shreya");
        // if(s1==s2){
        // System.out.println("Equal");
        // }
        // else{
        // System.out.println("Not equal");
        // }

        // if(s1==s3){
        // System.out.println("Equal");
        // }
        // else{
        // System.out.println("Not equal");
        // }

        // s1==s22 ------------equal bco both are equal are object level
        // s1==s3 --------------are not equal bcaoz they are not equal at object level

        // if (s1.equals(s3)) {
        //     System.out.println("Equal");
        // } else {
        //     System.out.println("Not equal");
        // }


        //SubString
        // String str = "HelloWorld";
        // System.out.println(str.substring(0,5));

        //Count how many times lowercase vowels ocuured in a string enetered by the user
        String str = new Scanner(System.in).next();
        int count = 0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'  ){
                count++;
            }
        }
        System.out.println(count);

    }

}
