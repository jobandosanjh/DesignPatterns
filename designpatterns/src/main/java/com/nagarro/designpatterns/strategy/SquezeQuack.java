package com.nagarro.designpatterns.strategy;

public class SquezeQuack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Squeze");
	}

}
