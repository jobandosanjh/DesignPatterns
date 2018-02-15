package com.nagarro.designpatterns.strategy;

public class RubberDuck extends Duck {

	public RubberDuck() {
		super(new NoFly(), new MuteQuack());
	}
}
