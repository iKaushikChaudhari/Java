import java.util.Scanner;
class Product
{
public static void main(String args[])
{
	int pId;
	String pName;
	float pPrice;
	
	//Product p1=new Product();
//Declare the object and initialize with
//predefined standard input object
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter Product ID: ");
	//Numerical input
	pId=s1.nextInt();
	System.out.println("Enter Product Name: ");
	//String input
	pName=s1.next();
	System.out.println("Enter Product Price: ");
	//float input
	pPrice=s1.nextFloat();
	//Output
	System.out.println("Product ID Is: "+pId);
	System.out.println("Product Name Is: "+pName);
	System.out.println("Product Name Is: "+pPrice);
}
}