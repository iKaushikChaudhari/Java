package Day05.java;
/*
*****
*****
*****
*****
*****
*/
import java.util.Scanner;
public class PatternUsingLoop1 {
	public static void main(String[] args) {
		int i,j;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Value Of i:");
		i=s1.nextInt();
		System.out.println("Enter Value Of j:");
		j=s1.nextInt();
		for(int a=1;a<=i;a++) {
			for(int b=1;b<=j;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("End Of The Program");

	}

}