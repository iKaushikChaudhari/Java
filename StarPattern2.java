package Day05.java;

public class StarPattern2 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.println("*");
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
