public class Problem2 {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {3,2,4,1};
        double avg = calculateAvg(n, arr);
        System.out.println(avg);
    }

    public static double calculateAvg(int n, int[] arr){
        return calculateSum(n, arr, 0) / (double) n;
    }

    public static int calculateSum(int n, int[] arr, int index){
        if (index == n) {
            return 0;
        }
        else {
            return arr[index] + calculateSum(n, arr, index+1);
        }
    }
}