import java.util.Scanner;
public class LargestofThree
{
	public static void main()
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter first number: ");
       	 	a = sc.nextInt();
		System.out.print("Enter second number: ");
                b = sc.nextInt();
		System.out.print("Enter third number: ");
                c = sc.nextInt();
		if (a >= b && a >=c)
			System.out.print("Largest="+a);
		else if (b >= a && b >=c)
			System.out.print("Largest="+b);
		else
			System.out.print("Largest="+c);
	}
}




