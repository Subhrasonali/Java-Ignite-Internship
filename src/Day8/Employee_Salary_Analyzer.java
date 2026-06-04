/*
Easy 2 – Employee Salary Analyzer

Create a program that:

Stores salaries of 5 employees in an array
Calculate and display:
Total Salary
Average Salary
Hint

Use a loop and a sum variable.
  */
package Day8;
import java.util.Scanner;

public class Employee_Salary_Analyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] salary = new int[5];
        int total = 0;

        System.out.println("Enter salaries of 5 employees:");

        for (int i = 0; i < 5; i++) {
            salary[i] = sc.nextInt();
            total += salary[i];
        }

        double average = (double) total / 5;

        System.out.println("Total Salary = " + total);
        System.out.println("Average Salary = " + average);

        sc.close();
    }
}