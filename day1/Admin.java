package com.ct;
/**
 * 
 * @author TrainingVDI
 *
 */
public class Admin {

	public static void main(String[] args) 
	{
		int a=90;
		int b=89;
		System.out.println("Value of a is " +(a+b));
		float f = 1.2F;
		System.out.println("float value is " + f);
		long l = 8898411509L;
		System.out.println("long value is " + l);
		char val = 'A';
		System.out.println("char is " + val);
		System.out.println('j'+'a'+'v'+'a');
		System.out.println('j');
		System.out.println((int)'j');//explicit type conversion
		
		int data = 'c';
		System.out.println(data);//implicit type conversion
		
		char ch = 99;
		System.out.println(ch);
		
		float res =('a'/2.0f);
		System.out.println(res);


	}

}

/*class Employee{
	int empId=1;
	String password="dummy";
}*/