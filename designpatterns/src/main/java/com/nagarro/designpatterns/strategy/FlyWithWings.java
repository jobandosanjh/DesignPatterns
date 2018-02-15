package com.nagarro.designpatterns.strategy;

public class FlyWithWings implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("Flying With Wings");
	}

}
