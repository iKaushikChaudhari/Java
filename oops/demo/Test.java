package com.oops.demo;

public class Test {

	public static void main(String[] args) {
		Employee1 e1=new Employee1();
         
		//e1.getData(101,"nani","Pune",5454.5f);
		//e1.displayData();
		
		e1.set_eId(10);
		e1.set_eName("Mahajan");
		System.out.println(e1.get_eId());
		System.out.println(e1.get_eName());

		
	}

}
