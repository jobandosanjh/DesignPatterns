package com.nagarro.designpatterns.strategy;

public abstract class Duck {

	protected final FlyBehaviour flyBehaviour;
	protected final QuackBehaviour quackBehaviour;

	public Duck(final FlyBehaviour flyBehaviour,
			final QuackBehaviour quackBehaviour) {
		this.flyBehaviour = flyBehaviour;
		this.quackBehaviour = quackBehaviour;
	}

	public void performQuack() {
		quackBehaviour.quack();
	}

	public void performFly() {
		flyBehaviour.fly();
	}

}
