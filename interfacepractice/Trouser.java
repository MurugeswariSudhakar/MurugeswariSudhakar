package com.example.interfacepractice;

public class Trouser extends Clothing implements Returnable {
	@Override
	public void doReturn() {
		System.out.println("Return trouser in 10 days\n");
	}
}
