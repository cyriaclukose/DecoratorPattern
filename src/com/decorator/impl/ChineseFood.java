package com.decorator.impl;

public class ChineseFood extends FoodDecorator {

	public ChineseFood(Food f) {
		super(f);
	
	}

	@Override
	public void preparefood() {
		
		super.preparefood() ;
		System.out.print(" chineese food");
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice();
	}
	
	

}
