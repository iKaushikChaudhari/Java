package Day10.java.main;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ClientDemo {

	public static void main(String[] args) {
		
		int a;
		try {
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter Number");
			a=s1.nextInt();
			throw new ArithmeticException();
		}catch(ArithmeticException e){
			System.out.println("Arithmatic Exception");

		}
		catch(InputMismatchException e){
			System.out.println("InputMismatch Exception");

		}
		catch(Exception e){
			System.out.println("Exception");

		}
	}
}


