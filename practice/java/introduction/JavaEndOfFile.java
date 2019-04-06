import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (sc.hasNext()) {
            String s1=sc.nextLine();
            System.out.println(String.format("%d %s", i++, s1));
        }
        sc.close();
    }
}
