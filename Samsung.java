package org.mit.engg.sy;
//Day03
public class Samsung {
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
	public static void main(String[] args) 
	{
		Samsung p1=new Samsung();
		p1.getDetails(101,"Samsung",45442.55f);
		p1.displayProductDetails();
	}

}
