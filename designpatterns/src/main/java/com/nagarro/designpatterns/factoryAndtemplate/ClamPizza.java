package com.nagarro.designpatterns.factoryAndtemplate;

public class ClamPizza extends Pizza {

	@Override
	public String getDescription() {
		return "Clam Pizza";
	}

	@Override
	protected void prepare() {
		System.out.println("Prepared With Clam");
	}

}
