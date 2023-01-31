package Day05.java;
import java.util.Scanner;
public class SwitchStatmentDemo1 {

	public static void main(String[] args) {
		int a;
		String b;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Value");
		a=s1.nextInt();
		switch(a)
		{
		case 1:
		{
			System.out.println("Enter Value Is One");
			break;
		}
		case 2:
		{
			System.out.println("Enter Value Is Two");
			break;
		}
		default:
		{
			System.out.println("Wrong Data");
			break;
		}
		}

		System.out.println("Enter String");
		b=s1.next();
		switch(b)
		{
		case "Kaushik":
		{
			System.out.println("Enter String Is Kaushik");
			break;
		}
		case "Omkar":
		{
			System.out.println("Enter String Is Omkar");
			break;
		}
		default:
		{
			System.out.println("Wrong Data");
			break;
		}
		}

	}
}


