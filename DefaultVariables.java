//Day03
//Default Variables Values 
public class DefaultVariables {
	int a;
	byte b;
	boolean b1;
	float f;
	char c;
	short s;
	double d;
	long l;
	String str ;
	
	//method to display the data 
	void displayData()
	{
		System.out.println("Int:"+a);
		System.out.println("byte:"+b);
		System.out.println("boolean:"+b);
		System.out.println("float:"+f);
		System.out.println("char:"+c);
		System.out.println("short:"+s);
		System.out.println("double:"+d);
		System.out.println("long:"+l);
		System.out.println("string:"+str);
	}
	public static void main(String args[]) {
		DefaultVariables d1=new DefaultVariables();
		d1.displayData();
	}
	
	

}
