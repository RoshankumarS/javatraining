package com.ct;
import java.util.Scanner;
public class first4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int out = 0;
		for(int i = 1;i<=b;i++)
		{
			out = out + a;
		}
		System.out.println(out);
	}
}
