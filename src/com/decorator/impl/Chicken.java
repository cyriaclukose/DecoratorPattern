package com.decorator.impl;

public class Chicken extends FoodDecorator {

	public Chicken(Food f) {
		super(f);
		
	}

	@Override
	public void preparefood() {
		
		super.preparefood();
		System.out.print(" and chicken roast");
	}

	@Override
	public double getPrice() {
		
		return super.getPrice()+45;
	}
	
	

}
