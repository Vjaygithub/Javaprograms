//Example for Arithmetic operation using Elseif Ladder
import java.util.*;
class ElseifArithmetic
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("\t\t\t Arithmetic Operations");
		System.out.println("1.Add\n2.Sub\n3.Mul");		
		System.out.println("Enter your choice (1/2/3)");
		int ch=s.nextInt();
		System.out.println("Enter 2 numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		if(ch==1)
		{
			System.out.println("Addition of 2 numbers "+(a+b));
		}
		else if(ch==2)
		{
			System.out.println("Substraction of 2 numbers" +(a-b));
		}
		else if(ch==3)
		{
			System.out.println("Multiplication of 2 numbers" +(a*b));
		}
		else
		{
			System.out.println("Reminder of 2 numbers " +(a%b));
		}
	}
}
