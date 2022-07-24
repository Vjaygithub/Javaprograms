//Accept a character and check whether it is Uppercase Alphabet or not
import java.util.*;
class IfelUpper
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Alphabet");
		char c=s.next().charAt(0);
		if(c>='A' && c<='Z')
		{
			System.out.println(c+ "  is a Uppercase alphabet");
		}
		else
		{
			System.out.println(c+ "  is not a Uppercase alphabet");
		}
	}
}