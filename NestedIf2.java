//Example for Smallest 3 numbers using nestedif statement
import java.util.*;
class NestedIf2
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three number");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a<b)
		{
			if(a<c)
			{
				System.out.println(a+ "is a smallest number");
			}
			else
			{
				System.out.println(c+ "is a smallest number");
			}
		}
		else
		{
			if(b<c)
			{
				System.out.println(b+ "is a smallest number");
			}
		}
	}
}
		