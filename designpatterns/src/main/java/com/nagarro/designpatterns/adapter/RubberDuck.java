package com.nagarro.designpatterns.adapter;

public class RubberDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("Silent");
	}

	@Override
	public void fly() {
		System.out.println("Can't Fly Ever");
	}
}
