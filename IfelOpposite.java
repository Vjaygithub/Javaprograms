//Accept an alphabet and change it into opposite case
import java.util.*;
class IfelOpposite
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Alphabet");
		char c=s.next().charAt(0);
		if(c>=65 && c<=90)
		{
			c=(char)(c+32);
		}
		else
		{
			c=(char)(c-32);
			System.out.println("Alphabet in opposite case = " +c);
		}
	}
}