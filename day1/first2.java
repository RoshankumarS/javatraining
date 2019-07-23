package com.ct;
import java.util.Scanner;
public class first2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = scn.nextInt();
		String[][] Array = {{"zero","one","two","three","four","five","six","seven","eight","nine"}, 
			                {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"}, 
			                {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"}};
		if (a < 10) {
			System.out.println(Array[0][a+1]);
		}
		if (a < 20 && a >= 10) {
			System.out.println(Array[a / 10][a % 10]);
		}
		if (a < 100 && a >= 20) {
			if(a%10 == 0) {System.out.println(Array[2][a/10-2]);}
			else{System.out.println(Array[2][a/10-2] + " " + Array[0][a % 10]);}
		}
	}
}
