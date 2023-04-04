public class Main {
    public static void main(String[] args) {
        int[] arr = {10,5,32,3,45};
        int min = findMininum(arr, arr.length);
        System.out.println("Minimum in the array is: " + min);
    }
    public static int findMininum(int[] arr, int n){
        if(n == 1){
            return arr[0];
        }else{
            int minValue = findMininum(arr, n-1);
            return Math.min(minValue, arr[n-1]);
        }
    }
}