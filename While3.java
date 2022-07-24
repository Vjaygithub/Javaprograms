//Even numbers from 50 to 100.
import java.io.*;
class While3
{
	public static void main(String args[])
	{
		System.out.println("List of Even numbers from 50 to 100");
		int n=100;
		int i=50;
		while(i<=100)
		{
			if(i%2==0)
			{
				System.out.println(i+ " ");
			}
		i++;
		}
	}
}