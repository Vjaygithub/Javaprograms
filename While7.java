//Print the factorial of n.
import java.util.*;
class While7
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		long fact=1;
		int i=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial of "+n+ "is :" +fact);
	}
}