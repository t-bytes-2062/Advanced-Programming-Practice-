import java.util.*;
public class Attendance
{
	public static void main()
	{
		Scanner sc=new Scanner(System.in);
		int[] attendance=new int[7];
		int present=0;
		System.out.println("Enter attendance[1-Present, 0-Absent]:");
		for (int i=0;i<7;i++)
		{
			attendance[i] = sc.nextInt();
			if (attendance[i] == 1)
                		present++;
		}
		double percentage = (present / 7.0) * 100;
		System.out.println("Attendance Percentage = " + percentage + "%");
		if (percentage >= 75)
            		System.out.println("Eligible for Exam");
        	else
            		System.out.println("Not Eligible");
    	}
}  
