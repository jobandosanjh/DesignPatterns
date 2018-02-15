package com.nagarro.designpatterns.strategy;

public class DuckTestDrive {

	public static void main(final String[] args) {
		testDuck(new MallardDuck());
		testDuck(new RobotDuck());
		testDuck(new RubberDuck());
		testDuck(new WoodenDuck());
	}

	private static void testDuck(final Duck duck) {
		duck.performFly();
		duck.performQuack();
	}

}
