package com.nagarro.designpatterns.strategy;

public class LoudQuack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Quack Quack");
	}

}
