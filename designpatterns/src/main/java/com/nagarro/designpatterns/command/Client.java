package com.nagarro.designpatterns.command;

public class Client {

	public static void main(final String[] args) {
		final Invoker invoker = new Invoker(new LightOnCommand());
		invoker.pressButton();
		invoker.setCommand(new TelevisionOnCommand());
		invoker.pressButton();
	}

}
