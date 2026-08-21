import java.util.Scanner;

class Temperature {
    double celsius;
    double fahrenheit;

    void convert() {
        fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Celsius = " + celsius);
        System.out.println("Fahrenheit = " + fahrenheit);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Temperature t = new Temperature();

        System.out.print("Enter Temperature in Celsius: ");
        t.celsius = sc.nextDouble();

        t.convert();
    }
}
