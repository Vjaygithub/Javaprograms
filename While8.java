//Print the prime number or not.
import java.util.*;
class While8
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int i=1,count=0;
		System.out.println("Factors of "+n);
		while(i<=n)
		{
			if(n%i==0)
			{
				System.out.println(i+ " ");
				count++;
			}
			i++;
		}
		if(count==2)
		{
			System.out.println(n+ "is a prime number");
		}
		else
		{
			System.out.println(n+ "is not a prime number");
		}
	}
}