import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static Scanner sc = new Scanner(System.in);
    private static boolean flag = false;
    private static int B = 1;
    private static int H = 1;

    static {
        B = sc.nextInt();
        H = sc.nextInt();
        try {
            check(B, H);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void check(int b, int h) throws Exception {
        if(B <= 0 || H <= 0){
            throw new Exception("Breadth and height must be positive");
        } else {
            flag = true;
        }
    }
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

