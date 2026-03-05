import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (!scan.hasNext()) {
            System.out.println(0);
            return;
        }
        String s = scan.nextLine();
        
        s = s.trim();
        
        if (s.length() == 0) {
            System.out.println(0);
        } else {
            String[] tokens = s.split("[^A-Za-z]+");
            
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        }
        scan.close();
    }
}
