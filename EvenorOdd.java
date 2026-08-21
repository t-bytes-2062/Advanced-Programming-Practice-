import java.util.Scanner;
public class EvenorOdd
{
	public static void main()
	{
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.print("Enter a number to check whether it is even or odd: ");
		a=sc.nextInt();
		if (a%2==0)
		{
			System.out.print("Even");
		}
		else
		{
			System.out.print("Odd");
		}
		sc.close();
	}
}
