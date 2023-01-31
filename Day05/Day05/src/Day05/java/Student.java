package Day05.java;
import java.util.Scanner;

public class Student {	
int sId;
String sName;
int s1,s2,s3,s4;
float marks;
float per;
Scanner s=new Scanner(System.in);
void getStudentDetails()
{
	System.out.println("enter the student id");
	sId=s.nextInt();
	System.out.println("enter the student name");
	sName=s.next();
	System.out.println("enter student marks:_");
	s1=s.nextInt();
	s2=s.nextInt();
	s3=s.nextInt();
	s4=s.nextInt();
	
	marks=s1+s2+s3+s4;
	per=(marks/400)*100;
	System.out.println(per);
	
	if(per>=65)
	{
		System.out.println("Distinction");
	}
	else if(per>=60 && per<65)
	{
		System.out.println("FIRST CLASS");
	}
	else if(per>=55 && per<60)
	{
		System.out.println("higher secondary class");
	}
	else if(per>=50 && per<55)
	{
		System.out.println("third class");
	}
	else if(per>=40 && per<50){
		System.out.println("pass");
		
	}
	else {
		System.out.println("fail");
	}
	
}

}
