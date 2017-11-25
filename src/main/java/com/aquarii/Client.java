package com.aquarii;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aquarii.cooks.MasterCook;
import com.aquarii.cooks.impl.ChrisImpl;
import com.aquarii.dishes.Dish;
import com.aquarii.dishes.impl.Dosa;
import com.aquarii.dishes.impl.Pizza;

public class Client {
	
	public static void main(String[] args) {
		
		try {
			final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/application.xml");
			context.registerShutdownHook();
			
			//final MasterCook cook = (MasterCook) context.getBean("chris");
//			final MasterCook cook = context.getBean("chris", ChrisImpl.class);
			final MasterCook cook = context.getBean(ChrisImpl.class);
			
			System.out.println(cook.cook());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	

	


}
