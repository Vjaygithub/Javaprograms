//Write a java program to accept a number and check whether it is even or odd using ifelse statement
import java.util.*;
class Ifel4
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		if(n%2==0)
		{
			System.out.println(n+ " is a Even number");
		}
		else
			System.out.println(n+ " is a Odd number");
	}
}