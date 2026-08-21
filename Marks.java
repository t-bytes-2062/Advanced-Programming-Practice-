import java.util.Scanner;

class Marks {
    int m1, m2, m3;
    int total;
    double average;

    void calculate() {
        total = m1 + m2 + m3;
        average = total / 3.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Marks m = new Marks();

        System.out.print("Enter Marks 1: ");
        m.m1 = sc.nextInt();

        System.out.print("Enter Marks 2: ");
        m.m2 = sc.nextInt();

        System.out.print("Enter Marks 3: ");
        m.m3 = sc.nextInt();

        m.calculate();
    }
}
