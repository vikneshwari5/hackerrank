import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNumber = 1;
        
        while (sc.hasNext()) {
            String lineContent = sc.nextLine();
            System.out.println(lineNumber + " " + lineContent);
            lineNumber++;
        }
        
        sc.close();
    }
}
