package com.nagarro.designpatterns.builderAnddecorator;

public class BaseModel implements Vehicle {

	private final Vehicle vehicle;
	private final boolean accessories;
	private final String windows;
	private final String brakes;

	public BaseModel(final Vehicle vehicle) {
		this.vehicle = vehicle;
		this.accessories = true;
		this.windows = "Manual";
		this.brakes = "Disc";
	}

	@Override
	public void display() {
		this.toString();
	}

	@Override
	public String toString() {
		return "BaseModel [vehicle=" + vehicle + ", accessories=" + accessories
				+ ", windows=" + windows + ", brakes=" + brakes + "]";
	}

}
