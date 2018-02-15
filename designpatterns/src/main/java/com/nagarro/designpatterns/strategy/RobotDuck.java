package com.nagarro.designpatterns.strategy;

public class RobotDuck extends Duck {

	public RobotDuck() {
		super(new FlyWithRocket(), new LoudQuack());
	}

}
