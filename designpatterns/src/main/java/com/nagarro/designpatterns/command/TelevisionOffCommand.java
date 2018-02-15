package com.nagarro.designpatterns.command;

public class TelevisionOffCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Television Off");
	}

}
