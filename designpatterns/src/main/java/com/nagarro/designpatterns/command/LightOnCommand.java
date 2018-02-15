package com.nagarro.designpatterns.command;

public class LightOnCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Light On");
	}

}
