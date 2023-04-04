import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for ( int i=0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int min = FindMin(arr, n);
        System.out.println("Minimum is " + min);
    }
    public static int FindMin(int[] arr, int n){
        if(n==1){
            return arr[0];
        }
        else {
            int min = FindMin(arr, n-1);
            return Math.min(min, arr[n-1]);
        }
    }
}