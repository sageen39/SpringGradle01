package com.aquarii.dishes.impl;

import com.aquarii.dishes.Dish;

public class Pizza implements Dish{
	private String receipe="PIZZA: Dough,flour,yeast,sugar,sauces";

	@Override
	public String getReceipe() {
		return this.receipe;
	}
	
	public void setReceipe(String receipe){
		this.receipe=receipe;
	}

}
