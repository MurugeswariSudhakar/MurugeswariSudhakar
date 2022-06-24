package com.example.interfacepractice;

public class USBCable extends Accessories implements Returnable {
	
	@Override
	public void doReturn() {
		System.out.println("Return USB Cable in 20 days\n");
	}

}
