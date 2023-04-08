import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = getfactorial(n);
        System.out.println(n + "! = " + result);
    }

    public static int getfactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * getfactorial(n-1);
    }
}
