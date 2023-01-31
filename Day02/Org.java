import java.util.Scanner;
class Org
{
	int Reg;
	String oName;
	String Loc;
public static void main(String args[])
{
	
	Org o1=new Org();
	//Declare the object and initialize with
	//predefined standard input object
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter Org Reg: ");
	//Numerical input
	o1.Reg=s1.nextInt();
	System.out.println("Enter Org Name: ");
	//String input
	o1.oName=s1.next();
	System.out.println("Enter Org Loc: ");
	//String input
	o1.Loc=s1.next();
	//Output
	System.out.println("Org Reg Is: "+o1.Reg);
	System.out.println("Org Name Is: "+o1.oName);
	System.out.println("Org Loc Is: "+o1.Loc);
}
}