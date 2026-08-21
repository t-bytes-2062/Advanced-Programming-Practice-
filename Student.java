import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int[] marks = new int[3];
    double attendance;

    Student(int rollNo, String name, int mark1, int mark2, int mark3, double attendance) {
        this.rollNo = rollNo;
        this.name = name;
        marks[0] = mark1;
        marks[1] = mark2;
        marks[2] = mark3;
        this.attendance = attendance;
    }

    void display() {
        int total = 0;

        for (int i = 0; i < 3; i++) {
            total += marks[i];
        }

        double average = total / 3.0;

        String result = average >= 50 ? "Pass" : "Fail";
        String scholarship = average >= 75 && attendance >= 80 ? "Eligible" : "Not Eligible";
        String performance = average >= 85 ? "Excellent" : "Good";

        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Attendance: " + attendance + "%");
        System.out.println("Result: " + result);
        System.out.println("Scholarship: " + scholarship);
        System.out.println("Performance: " + performance);
        System.out.println();
    }

    double getAverage() {
        int total = 0;

        for (int i = 0; i < 3; i++) {
            total += marks[i];
        }

        return total / 3.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Student " + (i + 1));

            System.out.print("Roll Number: ");
            int rollNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Mark 1: ");
            int mark1 = sc.nextInt();

            System.out.print("Mark 2: ");
            int mark2 = sc.nextInt();

            System.out.print("Mark 3: ");
            int mark3 = sc.nextInt();

            System.out.print("Attendance: ");
            double attendance = sc.nextDouble();

            students[i] = new Student(rollNo, name, mark1, mark2, mark3, attendance);
            System.out.println();
        }

        double highestAverage = students[0].getAverage();
        Student highestStudent = students[0];

        for (int i = 0; i < 5; i++) {
            students[i].display();

            if (students[i].getAverage() > highestAverage) {
                highestAverage = students[i].getAverage();
                highestStudent = students[i];
            }
        }

        System.out.println("Student with Highest Average");
        System.out.println("Name: " + highestStudent.name);
        System.out.println("Roll Number: " + highestStudent.rollNo);
        System.out.println("Average: " + highestStudent.getAverage());
    }
}
