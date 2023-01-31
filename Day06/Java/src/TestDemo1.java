public class TestDemo1 extends TestDemo2 {

	public static void main(String[] args) {
		TestDemo1 t1=new TestDemo1();
		TestDemo2 t2=new TestDemo2();
		System.out.println(t1 instanceof TestDemo1);
		System.out.println(t1 instanceof TestDemo2);
		System.out.println(t2 instanceof TestDemo2);
		System.out.println(t2 instanceof TestDemo1);
		

	}

}