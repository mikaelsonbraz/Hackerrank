import java.util.Scanner;

public class Solution4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1 = sc.next();
            int x = sc.nextInt();
            String numero;

            if (x < 10){
                numero = "00".concat(String.valueOf(x));
            } else if (x < 100) {
                numero = "0".concat(String.valueOf(x));
            } else {
                numero = String.valueOf(x);
            }

            System.out.printf("%-15s%s\n", s1, numero);
        }
        System.out.println("================================");

    }
}
