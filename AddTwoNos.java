import java.util.Scanner;
public class AddTwoNos
{
	public static void main()
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter first number: ");
		a=sc.nextInt();
		System.out.print("Enter second number: ");
                b=sc.nextInt();
		c=a+b;
		System.out.print("Sum=" +c);
		sc.close();
	}
}

;