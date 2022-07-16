//Write a java program to accept a number and check whether it is divisible by 5,7 or not using ifelse statement
import java.util.*;
class Ifel5
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		if(n%5==0 && n%7==0)
		{
			System.out.println(n+ " is divisible by 5,7 ");
		}
		else
			System.out.println(n+ " is not divisible by 5,7 ");
	}
}