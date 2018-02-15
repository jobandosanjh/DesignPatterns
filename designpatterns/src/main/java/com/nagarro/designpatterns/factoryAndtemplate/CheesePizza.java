package com.nagarro.designpatterns.factoryAndtemplate;

public class CheesePizza extends Pizza {

	@Override
	public String getDescription() {
		return "Cheese Pizza";
	}

	@Override
	protected void prepare() {
		System.out.println("Prepared With Cheese");
	}

}
