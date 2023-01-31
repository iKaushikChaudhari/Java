import java.util.Scanner;
class Org1
{
	int Reg;
	String oName;
	String Loc;
	//Org o1=new Org();
	Scanner s1=new Scanner(System.in);
	void getData();
	System.out.println("Enter Org Reg: ");
	//Numerical input
	Reg=s1.nextInt();
	System.out.println("Enter Org Name: ");
	//String input
	oName=s1.next();
	System.out.println("Enter Org Loc: ");
	//String input
	Loc=s1.next();
	//Output
	System.out.println("Org Reg Is: "+Reg);
	System.out.println("Org Name Is: "+oName);
	System.out.println("Org Loc Is: "+Loc);
public static void main(String args[])
{
	Org o1=new Org();
	o1.getData();
	o1.getData();
}
}