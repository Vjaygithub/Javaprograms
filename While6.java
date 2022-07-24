//Print the factors of a number.
import java.util.*;
class While6
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int i=1;
		System.out.println("factor of "+n);
		while(i<=n)
		{
			if(n%i==0)
			{
				System.out.println(i+ " ");
			}
		i++;
		}
	}
}