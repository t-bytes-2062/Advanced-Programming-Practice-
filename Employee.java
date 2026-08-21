import java.util.Scanner;

class Employee {
    String name;
    int id;
    double salary;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Employee e1 = new Employee();
        Employee e2 = new Employee();

        System.out.println("Enter First Employee Details");
        System.out.print("Name: ");
        e1.name = sc.nextLine();
        System.out.print("ID: ");
        e1.id = sc.nextInt();
        System.out.print("Salary: ");
        e1.salary = sc.nextDouble();
        sc.nextLine();

        System.out.println("\nEnter Second Employee Details");
        System.out.print("Name: ");
        e2.name = sc.nextLine();
        System.out.print("ID: ");
        e2.id = sc.nextInt();
        System.out.print("Salary: ");
        e2.salary = sc.nextDouble();

        System.out.println("\nFirst Employee");
        e1.display();

        System.out.println("\nSecond Employee");
        e2.display();
    }
}
