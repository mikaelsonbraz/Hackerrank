import java.util.*;
import java.io.*;

class Solution6{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            String numeros = String.valueOf(a + b);
            int mult = 1;
            int result = a + b;

            for (int x = 1; x <= n -1; x++){
                result += Math.pow(2, x) * b;
                numeros = numeros.concat(" " + result);
            }

            System.out.println(numeros);
        }
        in.close();
    }
}
