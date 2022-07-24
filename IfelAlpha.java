//Accept a character and check whether it is Alphabet or not
import java.util.*;
class IfelAlpha
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a alphabet");
		char c=s.next().charAt(0);
		if(c>=65 && c<=90 || c>=97 && c<=122)
		{
			System.out.println(c+ " is a Alphabet");
		}
		else
		{
			System.out.println(c+ " is not a Alphabet");
		}
	}
}