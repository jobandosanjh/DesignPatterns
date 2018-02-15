package com.nagarro.designpatterns.factoryAndtemplate;

public abstract class Pizza {

	protected abstract String getDescription();

	protected abstract void prepare();

	protected final void bake() {
		System.out.println("Baking");
	}

	protected final void cut() {
		System.out.println("Cutting");
	}

	protected final void box() {
		System.out.println("Packing");
	}

}
