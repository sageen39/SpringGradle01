package com.aquarii.dishes.impl;

import com.aquarii.dishes.Dish;

public class Dosa implements Dish{
	
	private String receipe = "DOSA: Rice, Black Lentils";

	@Override
	public String getReceipe() {
		
		return this.receipe;
	}
	
	public void setReceipe(String receipe){
		this.receipe=receipe;
	}

}
