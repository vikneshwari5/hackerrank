import java.time.LocalDate;
import java.util.Scanner;

class Result {
    
    public static String findDay(int month, int day, int year) {
       
        return LocalDate.of(year, month, day).getDayOfWeek().name();
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int month = scanner.nextInt();
            int day = scanner.nextInt();
            int year = scanner.nextInt();
            
            String res = Result.findDay(month, day, year);
            System.out.println(res);
        }
        
        scanner.close();
    }
}
