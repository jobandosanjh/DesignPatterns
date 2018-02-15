package com.nagarro.designpatterns.command;

public class TelevisionOnCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Television On");
	}

}
