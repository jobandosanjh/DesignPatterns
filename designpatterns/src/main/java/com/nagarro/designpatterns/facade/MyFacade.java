package com.nagarro.designpatterns.facade;

public class MyFacade {

	public void feelingCool() {
		System.out.println("Lights On");
		System.out.println("Television On");
		System.out.println("Speakers On");
		System.out.println("Amplifier On");
	}

	public void goingOut() {
		System.out.println("Lights Off");
		System.out.println("Television Off");
		System.out.println("Speakers Off");
		System.out.println("Amplifier Off");
	}

	public void relaxMood() {
		System.out.println("Lights Off");
		System.out.println("Television On");
	}
}
