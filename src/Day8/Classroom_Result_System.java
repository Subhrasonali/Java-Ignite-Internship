/*
Medium – Classroom Result System

Create a program that:

Stores marks of 10 students in an array
Count:
Number of students who passed (marks >= 35)
Number of students who failed (marks < 35)
Output Example
Passed Students: 7
Failed Students: 3
*/
package Day8;
import java.util.Scanner;

public class Classroom_Result_System {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[10];

        System.out.println("Enter marks of 10 students:");

        for (int i = 0; i < 10; i++) {
            marks[i] = sc.nextInt();
        }

        int pass = 0;
        int fail = 0;

        for (int i = 0; i < 10; i++) {
            if (marks[i] >= 35) {
                pass++;
            } else {
                fail++;
            }
        }

        System.out.println("Passed Students: " + pass);
        System.out.println("Failed Students: " + fail);

        sc.close();
    }
}