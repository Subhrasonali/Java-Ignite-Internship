/*
Advanced – Company Sales Dashboard (2D Array)

Create a program that:

A company has sales data for 3 branches and 4 months.

Store the sales data in a 2D array.

Calculate:

Total sales of each branch
Overall company sales
Branch with the highest total sales
Example Structure
Branch 1 -> Jan Feb Mar Apr
Branch 2 -> Jan Feb Mar Apr
Branch 3 -> Jan Feb Mar Apr
Hint

Use nested loops.
*/
package Day8;
import java.util.Scanner;

public class Company_Sales_Dashboard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] sales = new int[3][4];

        System.out.println("Enter sales data for 3 branches and 4 months:");

        for (int i = 0; i < 3; i++) {
            System.out.println("Branch " + (i + 1));
            for (int j = 0; j < 4; j++) {
                sales[i][j] = sc.nextInt();
            }
        }

        int overallSales = 0;
        int highestSales = 0;
        int highestBranch = 0;

        for (int i = 0; i < 3; i++) {

            int branchTotal = 0;

            for (int j = 0; j < 4; j++) {
                branchTotal += sales[i][j];
            }

            System.out.println("Total Sales of Branch " + (i + 1) + " = " + branchTotal);

            overallSales += branchTotal;

            if (branchTotal > highestSales) {
                highestSales = branchTotal;
                highestBranch = i + 1;
            }
        }

        System.out.println("Overall Company Sales = " + overallSales);
        System.out.println("Branch with Highest Sales = Branch " + highestBranch);

        sc.close();
    }
}