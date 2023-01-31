class Employee
{
	int eid=265;
	String name="Kaushik";
	String city="Pune";
	String dep="Software";
	float per=82.82f;
	char div='B';
public static void main(String args[])
	{
		//Object Creation 
		//creating an object using new keyword  
		//Class Name    
		Employee e1=new Employee();
		System.out.println("ID Of Employee Is: "+e1.eid);
		System.out.println("Name Of Employee Is: "+e1.name);
		System.out.println("City Of Employee Is: "+e1.city);
		System.out.println("Department Of Employee Is: "+e1.dep);
		System.out.println("Percentage Of Employee Is: "+e1.per);
		System.out.println("Divison No Of Employee Is: "+e1.div);

	}

}