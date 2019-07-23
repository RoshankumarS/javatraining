package com.ct.day2;
public class Count {
	public static void main(String[] args) {
		Objects a1 = new Objects();
		Objects a2 = new Objects();
		Objects a3 = new Objects();
		Objects a4 = new Objects();
		System.out.println(a1.i);
	}
}

class Objects{
	static int i=0;
	Objects() {
		i++;
	}
}