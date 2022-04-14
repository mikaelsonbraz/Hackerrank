import java.util.*;

public class Solution20 {

    static boolean isAnagram(String a, String b) {
        char[] listA = a.toCharArray();
        char[] listB = b.toCharArray();

        Arrays.sort(listA);
        Arrays.sort(listB);

        return Arrays.equals(listA, listB);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
