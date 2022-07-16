//Example for conditional Operator
// bigger among two numbers
import java.util.*;
class ConOpe
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int big=(a>b)?a:b;
		System.out.println("Bigger Number=" +big);
	}
}