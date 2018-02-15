package com.nagarro.designpatterns.factoryAndtemplate;

public class PaneerPizza extends Pizza {

	@Override
	public String getDescription() {
		return "Panner Pizza";
	}

	@Override
	protected void prepare() {
		System.out.println("Prepared With Panner");
	}

}
