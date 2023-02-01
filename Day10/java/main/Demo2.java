package Day10.java.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		int a, b,c;
		String str=null;
		int[] d= {10,20,30,40};
		Scanner s1=new Scanner(System.in);
		try {
			System.out.println("Outer Try Block");
			System.out.println("Enter First Number");
			a=s1.nextInt();
			System.out.println("Enter Second Number");
			b=s1.nextInt();	
			c=a/b;
			System.out.println("Result Of Div: "+c);
			try {
				System.out.println("Inner Try Block");
				System.out.println(d[2]);
				try {
					System.out.println("Inner Inner Try Block");
					System.out.println(str.charAt(0));
					
					
				}catch(NullPointerException e) {
					System.out.println("Nested Catch");
					System.out.println("NullPointer Exception");
				}
				finally {
					System.out.println("Inner Inner Finally Block");
					System.out.println("Nested Finally");
				}
				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Inner Catch Block");
				System.out.println("Array Index Out Of Bound Exception");
			}
			finally {
				System.out.println("Inner Finally");
			}
		}catch(InputMismatchException e) {
			System.out.println("Outer Catch Block Exception");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		finally {
			System.out.println("Outer Finally");
		}



	}

}
