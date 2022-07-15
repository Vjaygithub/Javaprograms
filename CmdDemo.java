//cmd line args example
import java.io.*;
class CmdDemo
{
	public static void main(String args[])
	{
		System.out.println("Cmd line args Concatenation");
		System.out.println("1st arg="+args[0]);
		System.out.println("2nd arg="+args[1]);
		String s=args[0]+args[1];
		System.out.println("Concatenation of 2 args ="+s);
	}
}
		