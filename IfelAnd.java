//Write a java program to check the 3 numbers are equal or not and operator using ifelse statement
import java.util.*;
class IfelAnd
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a==b && a==c)
		{
			System.out.println("Equal numbers");
		}
		else 
			System.out.println("Not Equal numbers");
	}
}