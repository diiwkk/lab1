import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean result = isPrime(n);
        if (result) {
            System.out.println(n + " Prime");
        } else {
            System.out.println(n + " Composite");
        }
    }

    public static boolean isPrime(int n, int i) {
        if (n == 2 || n == 3) {
            return true;
        }
        if (n < 2 || n % 2 == 0) {
            return false;
        }
        if (i > Math.sqrt(n)) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return isPrime(n, i+1);
    }

    public static boolean isPrime(int n) {
        return isPrime(n, 2);
    }
}
