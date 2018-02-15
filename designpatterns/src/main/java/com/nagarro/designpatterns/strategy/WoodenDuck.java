package com.nagarro.designpatterns.strategy;

public class WoodenDuck extends Duck {

	public WoodenDuck() {
		super(new NoFly(), new SquezeQuack());
	}

}
