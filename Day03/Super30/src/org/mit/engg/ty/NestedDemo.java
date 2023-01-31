package org.mit.engg.ty;

public class NestedDemo {

	public static void main(String[] args) {
		int a=30,b=20,c=10;
		if(a>b && a>c) {
			System.out.println("A Is Greater");
		}
		else if (b>a&&b>c) {
			System.out.println("B Is Greater");
		}
		else if (c>a&&c>b) {
			System.out.println("C Is Greater");
		}
		else {
			System.out.println("All Are Equal");
		}

	}

}
