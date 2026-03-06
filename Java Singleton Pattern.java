import java.util.Scanner;

class Singleton {
    public String str;
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getSingleInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String input = sc.nextLine();
            Singleton singleton = Singleton.getSingleInstance();
            singleton.str = input;
            System.out.println("Hello I am a singleton! Let me say " + singleton.str + " to you");
        }
    }
}
