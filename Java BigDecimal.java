import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        Arrays.sort(s, 0, n, (a, b) -> {
            BigDecimal b1 = new BigDecimal(a);
            BigDecimal b2 = new BigDecimal(b);
            return b2.compareTo(b1);
        });

        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
