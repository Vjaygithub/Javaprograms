//Accept a character and check whether it is Digit or not
import java.util.*;
class IfelDigit
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Digit");
		char c=s.next().charAt(0);
		if(c>='A' && c<='Z' || c>='a' && c<='z')
		{
			System.out.println(c+ "  is a digit");
		}
		else
		{
			System.out.println(c+ "  is not a Digit");
		}
	}
}