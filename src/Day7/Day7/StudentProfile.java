/*
(EASY)
Create a class Student:

Requirements:
name
age
marks
Tasks:
Initialize using constructor
Create 2 student objects
Display student details using method
Twist:

Marks should not be accessed directly.

Write your code below
----------------------------------------
*/
package Day7.Day7;

class Student {
    String name;
    int age;
    private double marks;

    Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println();
    }
}

public class StudentProfile {
    public static void main(String[] args) {

        Student s1 = new Student("Sonali", 20, 85.5);
        Student s2 = new Student("Rahul", 21, 92.0);

        s1.displayDetails();
        s2.displayDetails();
    }
}