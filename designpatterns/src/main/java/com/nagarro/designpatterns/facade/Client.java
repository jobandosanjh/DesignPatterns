package com.nagarro.designpatterns.facade;

public class Client {

	public static void main(final String[] args) {
		final MyFacade myFacade = new MyFacade();
		myFacade.feelingCool();
		myFacade.goingOut();
	}
}
