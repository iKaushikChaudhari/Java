package com.oops.demo;

public class Employee {
private int eId;
private String eName;
private String ecity;
private float eSalary;

public void getData(int eId,String eName,String ecity,float eSalary) {
	this.eId=eId;
	this.eName=eName; 
	this.ecity=ecity;
	this.eSalary=eSalary;
	
}
public void displayData() 
{
	System.out.println(eId);
	System.out.println(eName);
	System.out.println(ecity);
	System.out.println(eSalary);
}

}
