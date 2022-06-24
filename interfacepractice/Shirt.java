package com.example.interfacepractice;

public class Shirt extends Clothing implements Returnable {
	private String type;
    public String getType() {
		return type;
	}
	public void setTyoe(String type) {
		this.type = type;
	}
	@Override
	public void doReturn() {
    	System.out.println("Return shirt in 5 days\n");
    }
}
