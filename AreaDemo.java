import java.util.Scanner;

class Area {

    // Square
    void area(int side) {
        System.out.println("Area of Square = " + (side * side));
    }

    // Rectangle
    void area(int length, int breadth) {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    // Circle
    void area(double radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}

public class AreaDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Area obj = new Area();

        System.out.print("Enter side of square: ");
        int side = sc.nextInt();

        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        System.out.println();

        obj.area(side);
        obj.area(length, breadth);
        obj.area(radius);

        sc.close();
    }
}
