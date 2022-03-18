import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution2 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        ArrayList<Integer> weird = new ArrayList<>(8);
        for(int x = 6; x <= 20; x+=2){
            weird.add(x);
        }

        if (N % 2 != 0 || weird.contains(N)){
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }
}
