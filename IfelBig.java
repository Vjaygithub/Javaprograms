////Write a java program to check the Bigger number among 2 numbers using ifelse statement
import java.util.*;
class IfelBig
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=s.nextInt();
		int b=s.nextInt();
		if(a>b)
		{
			System.out.println(a+ " is big number");
		}
		else
			System.out.println(b+ " is big number");
	}
}
		