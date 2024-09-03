import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {
        int marks[] = new int[5];
        Scanner sc = new Scanner(System.in);


        // System.out.println("Length of Array= "+marks.length);

        for(int i=0;i<marks.length;i++){
            marks[i] = sc.nextInt();
            System.out.println("marks="+marks[i]);
        }
        System.out.println();
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();
        // System.out.println("phy: "+marks[0]);
        // System.out.println("chem: "+marks[1]);
        // System.out.println("math: "+marks[2]);
    }
    
}
