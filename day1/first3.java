package com.ct;
import java.util.Scanner;
public class first3 {
	public static void main(String[] args) {
		Addition add = new Addition();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = scn.nextInt();
		while(a >= 10) 
		{
			a = add.adda(a);
		}
		System.out.println(a);
	}
}
class Addition {  
    public int adda(int a)
    { 
    	int sum = 0;
        while(a>0) 
        {
        	sum = sum + a%10;
        	a = a / 10;
        }
        return sum;
    } 
}