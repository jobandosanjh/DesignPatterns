package com.nagarro.designpatterns.adapter;

public class WoddenDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("Squueze");
	}

	@Override
	public void fly() {
		System.out.println("Can't Fly Ever");
	}

}
