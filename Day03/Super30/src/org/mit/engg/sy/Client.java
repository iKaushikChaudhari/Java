package org.mit.engg.sy;

public class Client {
	public static void main(String[] args) {
		Product p1=new Product();
		p1.getDetails(101,"Samsung",45442.55f);
		p1.displayProductDetails();
	}

}
