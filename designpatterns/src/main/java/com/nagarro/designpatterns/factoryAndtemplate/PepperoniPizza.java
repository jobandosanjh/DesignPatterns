package com.nagarro.designpatterns.factoryAndtemplate;

public class PepperoniPizza extends Pizza {

	@Override
	public String getDescription() {
		return "Pepperoni Pizza";
	}

	@Override
	protected void prepare() {
		System.out.println("Prepared With Pepperoni");
	}

}
