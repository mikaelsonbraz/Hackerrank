import java.io.*;
import java.util.*;

public class Solution16 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        String lexico = (A.substring(0, 1).compareTo(B.substring(0, 1)) > 0) ? "Yes" : "No";

        System.out.println(A.length() + B.length());
        System.out.println(lexico);
        System.out.println((A.substring(0, 1).toUpperCase(Locale.ROOT) + A.substring(1)) + " " + (B.substring(0, 1).toUpperCase(Locale.ROOT) + B.substring(1)));
    }
}



