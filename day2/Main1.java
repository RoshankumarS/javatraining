package com.ct.day2;

public class Main1 {

	public static void main(String[] args) {
		Tv t = new Tv();
		Radio r = new Radio();
		Projector p = new Projector();
		t.nextChannel();
		t.previousChannel();
		r.nextFrequency();
		r.previousFrequency();
		p.increaseImage();
		p.decreaseImage();
	}
}