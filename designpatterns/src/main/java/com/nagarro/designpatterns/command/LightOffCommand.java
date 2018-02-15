package com.nagarro.designpatterns.command;

public class LightOffCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Light Off");
	}

}
