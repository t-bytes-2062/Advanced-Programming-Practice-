import java.util.Scanner;

class Student2 {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println("Enter First Student Details");
        System.out.print("Name: ");
        s1.name = sc.nextLine();
        System.out.print("Age: ");
        s1.age = sc.nextInt();
        sc.nextLine();

        System.out.println("\nEnter Second Student Details");
        System.out.print("Name: ");
        s2.name = sc.nextLine();
        System.out.print("Age: ");
        s2.age = sc.nextInt();

        System.out.println("\nFirst Student");
        s1.display();

        System.out.println("\nSecond Student");
        s2.display();
    }
}
