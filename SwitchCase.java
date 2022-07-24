//Write a program to accept a choice, if the choice;1.Add 2.Sub 3.Mul 4.Reminder using Switch case.
import java.util.*;
class SwitchCase {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("\t\t\t Arithmetic Operations");
		System.out.println("1.Add");
		System.out.println("2.Sub");
		System.out.println("3.Mul");
		System.out.println("4.Reminder");
		System.out.println("Enter your choic(1/2/3/4)");
		int choice=s.nextInt();
		System.out.println("Enter 2 numbers");
			int a=s.nextInt();
			int b=s.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Addition=\t" +(a+b));
				break;
			case 2:
				System.out.println("Substraction=\t" +(a-b));
				break;
			case 3:
				System.out.println("Multiplication=\t" +(a*b));
				break;
			case 4:
				System.out.println("Reminder=\t" +(a%b));
			default:
				System.out.println("Wrong choice");
			}
	
	}
}

