package com.nagarro.designpatterns.strategy;

public class MallardDuck extends Duck {

	public MallardDuck() {
		super(new FlyWithWings(), new LoudQuack());
	}

}
