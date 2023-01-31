package Day09.java.comp;
//Day09 Exception Handling
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling {

	public static void main(String[] args) {
		int a, b, c;
		Scanner s1=new Scanner(System.in);
		try{
			System.out.println("Enter 1st Number: ");

			a=s1.nextInt();
			System.out.println("Enter 2nd Number: ");
			//if(b>0)
			b=s1.nextInt();

			c=a/b;
			System.out.println("Result "+c);
		}
		catch(InputMismatchException e) {
			System.out.println("Enter Integer Data");
		}
		catch(ArithmeticException e) {
			System.out.println("Enter Second Data Grator than 0");
		}
		catch(Exception e) {
			System.out.println("Unkonown Error");
		}



	}

}
