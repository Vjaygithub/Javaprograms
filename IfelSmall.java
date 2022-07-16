//Write a java program to check the Smaller number among 2 numbers using ifelse statement
import java.util.*;
class IfelSmall
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=s.nextInt();
		int b=s.nextInt();
		if(a<b)
		{
			System.out.println(a+ "is small number");
		}
		else 
			System.out.println(b+ "is small number");
	}
}