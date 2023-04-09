import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

//        int arr[] = {10,1,32,3,45};
//        System.out.println(findMin(arr[0], 0, arr)); // I start with giving the minimum as the first element
//        // the second parameter is the current element and the last argument is the array itself

//        int arr[] = {3,2,4,1};
//        System.out.println(findAverage(0,0,arr)); // as arguments, I give the sum of all elements the current element and the array itself

//        int n = 367;
//        if (isPrime(n, 2)){ // the number itself and the temp which is 2 because we are starting to divide the n by it
//            System.out.println("Prime");
//        }else{
//            System.out.println("Composite");
//        }

//        System.out.println(factorial(5));
    }
    static double findAverage(double sum, int n, int arr[]) {
        if (n == arr.length) {
            return sum / arr.length;
        }
        return findAverage(sum + arr[n], n + 1, arr);
    }

    static int findMin(int min, int n, int arr[]) {
        if (n == arr.length) {
            return min;
        }

        if (min > arr[n]) {
            return findMin(arr[n], n + 1, arr);
        } else {
            return findMin(min, n + 1, arr);
        }

    }

    // Declaring a function
    static boolean isPrime(int n, int temp) {
        if (n <= 2 && n > 0)
            return true;
        if (n % temp == 0) {
            return false;
        }
        if (temp * temp > n) {
        }
        temp++;
        return isPrime(n, temp);
    }
    static int factorial(int n) {
        // Check if n is less than or equal to 0
        if (n <= 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    static int fibonacci(int n){
        if (n <= 0){
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    static int power(int a, int n){
        if(n == 1){
            return a;
        }
        return power(a, n - 1) * a;
    }
}