/*
1. Attendance Tracker (Medium)

A class has attendance records for 10 students.

Store attendance as:

1 = Present
0 = Absent

Calculate:

Total Present Students
Total Absent Students
Attendance Percentage
*/
package Day8;
import java.util.Scanner;

public class Attendance_Tracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] attendance = new int[10];

        System.out.println("Enter attendance for 10 students (1=Present, 0=Absent):");

        for (int i = 0; i < 10; i++) {
            attendance[i] = sc.nextInt();
        }

        int present = 0;
        int absent = 0;

        for (int i = 0; i < 10; i++) {
            if (attendance[i] == 1) {
                present++;
            } else {
                absent++;
            }
        }

        double percentage = (present * 100.0) / 10;

        System.out.println("Total Present Students: " + present);
        System.out.println("Total Absent Students: " + absent);
        System.out.println("Attendance Percentage: " + percentage + "%");

        sc.close();
    }
}