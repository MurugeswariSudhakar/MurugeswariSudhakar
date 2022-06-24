package com.example.interfacepractice;

public class InterfaceTest {
	
	public static void print(Object obj) {
		if (obj instanceof Returnable) {
			System.out.println(obj.getClass().getSimpleName()+" is an instance of Returnable");
			((Returnable) obj).doReturn();
		}
		else
			System.out.println(obj.getClass().getSimpleName()+" is not an instance of Returnable\n");
	}
	public static void main (String[] args) {
		
		Product product = new Shirt();
		print(product);
		
		product = new Stove();
		print(product);
		
		Clothing cloth = new Trouser();
		print(cloth);
		
		cloth = new CustomShirt();
		print(cloth);
		
		Accessories a1 = new Tent();
		print(a1);
		
		a1 = new USBCable();
		print(a1);
		
		a1 = new Stove();
		print(a1);
		
	}
}
