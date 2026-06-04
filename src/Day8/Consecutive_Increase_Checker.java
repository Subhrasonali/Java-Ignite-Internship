/*
Consecutive Increase Checker 

Store 5 numbers in an array.

Determine whether the numbers are in strictly increasing order.

Example
10 20 30 40 50

Output:

Array is in increasing order

Example:

10 20 15 40 50

Output:

Array is NOT in increasing order
  */
package Day8;
import java.util.Scanner;

public class Consecutive_Increase_Checker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        boolean increasing = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                increasing = false;
                break;
            }
        }

        if (increasing) {
            System.out.println("Array is in increasing order");
        } else {
            System.out.println("Array is NOT in increasing order");
        }

        sc.close();
    }
}