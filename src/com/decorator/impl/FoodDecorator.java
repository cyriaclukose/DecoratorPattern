package com.decorator.impl;

public abstract class FoodDecorator implements Food {
	
	
	private Food food;
	
	public FoodDecorator(Food f )
	{
		this.food=f;
	}

	@Override
	public void preparefood() {
	
		food.preparefood();
	}

	@Override
	public double getPrice() {
		
		return food.getPrice();
	}

}
