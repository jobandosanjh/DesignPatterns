package com.nagarro.designpatterns.command;

public class Invoker {

	private Command command;

	public Invoker(final Command command) {
		this.command = command;
	}

	public void pressButton() {
		command.execute();
	}

	public void setCommand(final Command command) {
		this.command = command;
	}

}
