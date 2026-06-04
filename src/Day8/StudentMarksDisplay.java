/*
Easy 1 – Student Marks Display

Create a program that:

Stores 5 student marks in a 1D array
Prints all marks using a loop
Sample Output
Student Marks:
78
65
90
82
55
  */
package Day8;
import java.util.Scanner;

public class StudentMarksDisplay {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        System.out.println("Enter marks of 5 students:");

        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("Student Marks:");

        for (int i = 0; i < 5; i++) {
            System.out.println(marks[i]);
        }

        sc.close();
    }
}