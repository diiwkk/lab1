import java.util.Scanner;

public class problem6 {
    public static double power(double a, int n) {
        if (n == 0) {
            return 1.0;
        } else if (n == 1) {
            return a;
        } else if (n < 0) {
            return 1.0 / power(a, -n);
        } else if (n % 2 == 0) {
            double temp = power(a, n / 2);
            return temp * temp;
        } else {
            return a * power(a, n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        int n = input.nextInt();
        input.close();
        double result = power(a, n);
        System.out.println(result);
    }
}
