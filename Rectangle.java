import java.util.Scanner;

class Rectangle {
    double length;
    double breadth;

    void area() {
        double area = length * breadth;
        System.out.println("Area = " + area);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Rectangle r = new Rectangle();

        System.out.print("Enter Length: ");
        r.length = sc.nextDouble();

        System.out.print("Enter Breadth: ");
        r.breadth = sc.nextDouble();

        r.area();
    }
}
