
public class ClientEmpEnc {

	public static void main(String[] args) {
		Employee e1=new Employee();
		
		e1.getData(101,"Kaushik","Pune",56756.56f);
		e1.displayData();
		e1.seteId(102);
		System.out.println(e1.geteId());
		e1.seteName("Shreya");
		System.out.println(e1.geteName());
		e1.seteCity("Amd");
		System.out.println(e1.geteCity());
		e1.seteSal(84572.55f);
		System.out.println(e1.geteSal());
	}
	


}
