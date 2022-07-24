//Accept a color and print if it is R print Red,G print Green,B print Blue,else white
import java.io.*;
class SwitchCase3 
{

	public static void main(String[] args) 
	{
		char c='G';
		switch(c)
		{
		case 'R':
			System.out.println("Red");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		default:
			System.out.println("White");
		}
	}

}
