//Write a java program to check the number is +ve or not using simpleif statement
import java.util.*;
class SimIf
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		if(n>0)
		{
			System.out.println(n+ "is a +ve number");
		}
		System.out.println("End");
	}
}