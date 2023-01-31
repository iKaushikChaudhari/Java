package Day05.java;

public class ArathmaticOperatorsDemo1 {
	int a,b,Result;
	void getData(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void add()
	{
		Result=a+b;
		System.out.println("Add is "+Result);
	}
	void sub()
	{
		Result=a-b;
		System.out.println("Sub is "+Result);
	}
	void mul()
	{
		Result=a*b;
		System.out.println("Mul is "+Result);
	}
	void div()
	{
		Result=a/b;
		System.out.println("Div is "+Result);
	}
	void modu()
	{
		Result=a%b;
		System.out.println("Modulo is "+Result);
	}


}
