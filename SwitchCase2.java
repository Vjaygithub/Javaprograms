//Write a program to accept an alphabet and check whether it is vowel or consonant using switchcase.
import java.io.*;
class SwitchCase2
{
	public static void main(String args[])
	{
		char c='o';
		switch(c)
		{
		case 'A':
		case 'a':
		case 'E':
		case 'e':
		case 'I':
		case 'i':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");
		}
	}
}