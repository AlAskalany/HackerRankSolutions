import java.util.*;
import java.io.*;
import java.lang.Math;
import java.util.stream.*;

class Solution{
    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for (int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            printSeries(a, b, n);
            System.out.println();
        }
        in.close();
    }

    public static int element(int n, int p) {
        return  ((int) Math.pow(2, p)) * n;
    }

    public static void printSeries(int a, int b, int n) {
        int sum = a;
        for (int j = 0; j < n; j++) {
            sum += element(b, j);
            System.out.print(sum + " ");
        }
    }
}
