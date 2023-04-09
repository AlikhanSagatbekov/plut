import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    //Main function for testing the solutions
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

    // Declaring a function
    static double findAverage(double sum, int n, int arr[]) {
        // Check if we've processed all elements in the array
        if (n == arr.length) {
            // If we have, return the average by dividing the sum by the length of the array
            return sum / arr.length;
        }

        // If there are still elements to process, add the current element to the sum and recurse
        return findAverage(sum + arr[n], n + 1, arr);
    }


    //This is the fucntion to find the minimum element in the array
    //recursively
    static int findMin(int min, int n, int arr[]) { // the program starts with the min or first element
        if (n == arr.length) { // The condition to exit recursion
            return min; // returning the current minimum number
        }

        if (min > arr[n]) { // we go through the every element of the array
            return findMin(arr[n], n + 1, arr);  // if the element is lower than we take it as minimum
        } else {
            return findMin(min, n + 1, arr); // if
        }

    }

    // Declaring a function
    static boolean isPrime(int n, int temp) { // It is important to start from 2 when we are dealing with this function
        if (n <= 2 && n > 0) // if the number is too small the program exits
            return true;
        if (n % temp == 0) { // If the number can be divided without left over than it is not Prime (exit condition)
            return false;
        }
        if (temp * temp > n) { // the second exit condition because mathematically proven that all the numbers that can divide a certain number lie before the square of N
            return true;
        }
        temp++;// to go through all the numbers inside
        return isPrime(n, temp); // calling the function for every temporary number
    }

    // Declare a function named "factorial" that takes in an integer "n" as an argument
    static int factorial(int n) {
        // Check if n is less than or equal to 0
        if (n <= 0) {
            // If it is, return 1 (since 0! and negative numbers are not defined)
            return 1;
        }
        // If n is greater than 0, recursively call the factorial function with n-1 and multiply it by n
        return n * factorial(n - 1);
    }
}