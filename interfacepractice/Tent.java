package com.example.interfacepractice;

public class Tent extends Accessories implements Returnable {
	@Override 
	public void doReturn() {
		System.out.println("Return the tent in 15 days\n");
	}
}
