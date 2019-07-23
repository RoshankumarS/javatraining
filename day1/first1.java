package com.ct;

import java.util.Scanner;

public class first1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = scn.nextInt();
		String[] Array = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		if (a < 10) {
			System.out.println(Array[a]);
		}
		if (a < 100 && a >= 10) {
			System.out.println(Array[a / 10] + " " + Array[a % 10]);
		}
		if (a < 1000 && a >= 100) {
			System.out.println(Array[a / 100] + " " + Array[(a / 10) % 10] + " " + Array[a % 10]);
		}
	}
}
