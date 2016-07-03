package com.Colect;

public class Main {
	
	public static void main(String[] args){
		
		Car c = new Car ("Tesla ",50000, 1, 200, "BMV", "Sport", 2, 1000, "winter ", "FIRESTONE  ", 
				"High  ",700, 20000, "Tesla", "Black");
		
		System.out.println(c);
		c.discountBody(10);
		
		System.out.println(c.getWheel());
		System.out.println(c.wheel);
		
		c.body.setCollor("red");
		System.out.println(c.body.collor);
		
		System.out.println(c.wheel);
		
		c.wheel.discountWheel(10);
		//c.discountWheel(10);
		
		
		c.discountBody(30);
		c.wheel.discountWheel(30);
		
//		Don d = new Don(1, 120, " Mercedess ", "classic ") ;
//		Wheel w = new Wheel(3, 1, "123","45", "789");
//		Body b = new Body(500, 40000, " MercedessA" , "Blue");
//		Car c2 = new Car ();
//		c2();
		
		
	}
}
