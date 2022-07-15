//cmd line arg swapping without using third variable
import java.io.*;
class CmdSwap2
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);//a=10
		int b=Integer.parseInt(args[1]);//b=20
		System.out.println("Values before swapping");
		System.out.println("1st args="+args[0]);
		System.out.println("2nd args="+args[1]);
		System.out.println("Values after swapping");
		    a=a+b;//a=10+20=30
		    b=a-b;//b=30-20=10
		    a=b-a;//a=10-30=-20
		System.out.println("1st value="+a);
		System.out.println("2nd value="+b);
	}
}