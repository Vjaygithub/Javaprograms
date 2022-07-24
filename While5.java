//Numbers divisible by 5 from 200 to 300.
import java.io.*;
class While5
{
	public static void main(String args[])
	{
		System.out.println("Numbers divisible by 5 from 200 to 300");
		int n=300;
		int i=200;
		while(i<=n)
		{
			if(i%5==0)
			{
				System.out.println(i+ " ");
			}
		i++;
		}
	}
}