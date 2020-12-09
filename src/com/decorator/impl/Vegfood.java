package com.decorator.impl;

public class Vegfood implements Food {

	@Override
	public void preparefood() {
	
   System.out.print("Veg food is prepared ");
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 25.87d;
	}

}
