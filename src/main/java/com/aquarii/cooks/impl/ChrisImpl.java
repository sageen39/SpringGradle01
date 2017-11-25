package com.aquarii.cooks.impl;

import com.aquarii.cooks.MasterCook;
import com.aquarii.dishes.Dish;

public class ChrisImpl implements MasterCook{
	
	private Dish dish;
	private String tableNo;

	public ChrisImpl(Dish dish, String tableNo){
		this.dish=dish;
		this.tableNo=tableNo;
	}

	@Override
	public String cook() {
		
	String receipe = this.dish.getReceipe();
	
	StringBuilder sb = new StringBuilder("|COOK|");
	sb.append(this.tableNo+"|");
	sb.append(receipe);
	
	return sb.toString();
	}

}
