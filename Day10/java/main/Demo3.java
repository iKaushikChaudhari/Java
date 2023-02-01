package Day10.java.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo3 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File f1=new File("D:\Java\JAVA\Day01\CoreJava.java");
		try(FileInputStream fileInputStream=new FileInputStream(f1)){
			System.out.println("Hello Kaushik");
			
		}

	}

}
