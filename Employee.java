package org.mit.engg.sy;

import java.util.Scanner;

public class Employee {
	int eId;
	String name;
	String city;
	Scanner s1=new Scanner(System.in);
	void getEmployee()
	{
		System.out.println("Enter Employee ID :");
		eId=s1.nextInt();
		System.out.println("Enter Employee Name :");
		name=s1.next();
		System.out.println("Enter Employee City :");
		city=s1.next();
	}
	void display() 
	{
		System.out.println("Employee ID :"+eId);
		System.out.println("Employee Name :"+name);
		System.out.println("Employee City :"+city);
	}

	public static void main(String args[]) 
	{
		Employee e1=new Employee();
		e1.getEmployee();
		e1.display();
	}
}
