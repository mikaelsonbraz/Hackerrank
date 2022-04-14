import java.util.Scanner;

public class Solution19 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String invert = (new StringBuffer(A).reverse().toString()).equalsIgnoreCase(A) ? "Yes" : "No";

        System.out.println(invert);

    }
}
