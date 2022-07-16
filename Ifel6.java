//Write a java program to accept a number and check whether it is LEAP year or not using ifelse statement
import java.util.*;
class Ifel6
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a year");
		int n=s.nextInt();
		if(n%4==0)
		{
			System.out.println(n+ " is a Leap year");
		}
		else
			System.out.println(n+ " is not a Leap year");
	}
}