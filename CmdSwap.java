//Cmd line args Swaping of 2 double numbers
import java.io.*;
class CmdSwap
{
	public static void main(String args[])
	{
		System.out.println("Cmd line args Swapping of 2 double values");
		double a=Double.parseDouble(args[0]);
		double b=Double.parseDouble(args[1]);
		System.out.println("values before swappping");
		System.out.println("1st value="+a+"2nd value="+b);
		double temp=a;
		a=b;
		b=temp;
		System.out.println("values after swapping");
		System.out.println("1st value="+a + "2nd value="+b);
	}
}
		