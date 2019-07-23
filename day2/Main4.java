package com.ct.day2;

public class Main4 {

	public static void main(String[] args) {
		Dayscholar d = new Dayscholar();
		Hosteller h = new Hosteller();
		d.commute();
		d.payCollegeFees();
		h.payHostelFees();
		h.payCollegeFees();
	}

}
