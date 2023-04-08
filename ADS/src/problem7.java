import java.util.Scanner;

public class problem7 {
    public static void reverse(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        arr[start] ^= arr[end];
        arr[end] ^= arr[start];
        arr[start] ^= arr[end];
        reverse(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        input.close();
        reverse(arr, 0, n - 1);
        System.out.print("The reversed array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
