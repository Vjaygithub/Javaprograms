//print the odd numbers from 100 to 50.
import java.io.*;
class While4
{
	public static void main(String args[])
	{
		System.out.println("List of odd numbers from 100 to 50");
		int n=100;
		int i=50;
		while(n>=i)
		{
			if(n%2==1)
			{
				System.out.println(n+ " ");
			}
		n--;
		}
	}
}