//cmd line args example
import java.io.*;
class CmdParse
{
	public static void main(String args[])
	{
		System.out.println("Cmd line args Adding of 2 Integers");
		System.out.println("1st arg="+args[0]);
		System.out.println("2nd arg="+args[1]);
		//Converting cmd line args to integers
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		//adding of 2 numbers
		int s=a+b;
		System.out.println("Adding of 2 numbers="+s);
	}
}