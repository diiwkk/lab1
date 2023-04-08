import java.util.Scanner;

public class problem8 {
    public static boolean isAllDigits(String s) {
        if (s.length() == 0) {
            return false;
        }
        if (s.length() == 1) {
            return Character.isDigit(s.charAt(0));
        }
        return Character.isDigit(s.charAt(0)) && isAllDigits(s.substring(1));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        input.close();
        boolean result = isAllDigits(s);
        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
