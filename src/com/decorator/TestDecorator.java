package com.decorator;

import com.decorator.impl.Chicken;
import com.decorator.impl.ChineseFood;
import com.decorator.impl.Food;
import com.decorator.impl.Vegfood;

public class TestDecorator {

	// decorator pattern is used to add additional functionality to the objecta t runtimne
	//usuall we have an interface and it has a concrete implementation
	// and we want to add additional functionality to the implementation
	// so we create a decorator claass which extend the interface
	//the additional features are aded as subclass of the decorator
	
	
	public static void main (String [] args)
	{
		
		
		// test veg food pluss the no veg
		
		Food novegcombo=new Chicken(new Vegfood());
		novegcombo.preparefood();
		novegcombo.getPrice();
		System.out.println();
		Food chinees=new ChineseFood(new Vegfood());
		chinees.preparefood();
		chinees.getPrice();
		
		
	}
}
