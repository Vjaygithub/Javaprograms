//Example for Biggest 3 numbers using nestedif statement
import java.util.*;
class NestedIf
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three number");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+ "is a biggest number");
			}
			else
			{
				System.out.println(c+ "is a biggest number");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println(b+ "is a biggest number");
			}
		}
	}
}
		