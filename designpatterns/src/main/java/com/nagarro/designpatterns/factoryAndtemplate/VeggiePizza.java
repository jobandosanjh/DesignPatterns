package com.nagarro.designpatterns.factoryAndtemplate;

public class VeggiePizza extends Pizza {

	@Override
	public String getDescription() {
		return "Veggie Pizza";
	}

	@Override
	protected void prepare() {
		System.out.println("Prepared With Vegetables");
	}

}
