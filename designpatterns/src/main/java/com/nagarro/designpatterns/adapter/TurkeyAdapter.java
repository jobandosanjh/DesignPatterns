package com.nagarro.designpatterns.adapter;

public class TurkeyAdapter implements Duck {

	private final Turkey turkey;

	public TurkeyAdapter(final Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		System.out.println("Flying With Short Distance");
	}

}
