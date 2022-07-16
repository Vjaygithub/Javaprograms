//Write a java program to check the character is R or not using simpleif statement
import java.util.*;
class SimIf2
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a alphabet");
		char c=s.next().charAt(0);
		if(c=='R' || c=='r')
		{
			System.out.println(c+ "is R");
		}
		System.out.println("End");
	}
}