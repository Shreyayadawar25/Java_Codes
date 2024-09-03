import java.util.Scanner;

public class DuplicateCharater {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        // String str = sc.next();
        // char[] charArray = str.toCharArray();
        // System.out.println("The string is:" + str);
        // System.out.print("Duplicate Characters in above string are: ");
        // for (int i = 0; i < str.length(); i++) {
        // for (int j = i + 1; j < str.length(); j++) {
        // if (charArray[i] == charArray[j]) {
        // System.out.println(charArray[j] + " ");
        // break;
        // }
        // }
        // }
        String str = sc.nextLine();
        int count;
        char[] carray = str.toCharArray();
        System.out.println("The string is:" + str);
        System.out.print("Duplicate Characters in above string are: ");
        for (int i = 0; i < str.length(); i++) {
            count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (carray[i] == carray[j] && carray[i] != ' ') {
                    count++;
                    carray[j] = '0';
                }
            }
            if (count > 1 && carray[i] != '0')
                System.out.println(carray[i]);
        }
        // for (int i = 0; i < str.length(); i++) {
        //     for (int j = i + 1; j < str.length(); j++) {
        //         if (carray[i] == carray[j]) {
        //             System.out.println(carray[j]);
        //         }
        //     }
        // }

    }
}
