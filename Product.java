package org.mit.engg.sy;

public class Product {
	int pid;
	String pName;
	float pPrice;
	void getDetails(int pid,String pName,float pPrice) {
		this.pid=pid;
		this.pName=pName;
		this.pPrice=pPrice;
	}
	void displayProductDetails() {
		System.out.println("Product ID is "+pid);
		System.out.println("Product Name is "+pName);
		System.out.println("Product Price is "+pPrice);
	}

}
