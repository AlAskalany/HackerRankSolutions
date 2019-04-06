import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("================================");
            for (int i=0;i<3;i++) {
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.println(getFirstColumn(s1) + getDigits(x));
            }
            System.out.println("================================");

    }

    /**
     * Get string with right padding of 15.
     */
    public static String getFirstColumn(String s) {
        return String.format("%1$-" + 15 + "s", s);
    }

    /**
     * Get number as as a 3-digit string with leading 0s.
     */
    public static String getDigits(int num) {
        return String.format("%03d", num);
    }
}
