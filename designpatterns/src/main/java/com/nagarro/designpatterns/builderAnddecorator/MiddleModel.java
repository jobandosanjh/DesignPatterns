package com.nagarro.designpatterns.builderAnddecorator;

public class MiddleModel implements Vehicle {

	private final Vehicle vehicle;
	private final boolean accessories;
	private final boolean parkingSensors;
	private final boolean automaticClimateControl;
	private final String windows;
	private final String brakes;
	private final String airBags;

	public MiddleModel(final Vehicle vehicle) {
		this.vehicle = vehicle;
		this.accessories = true;
		this.parkingSensors = true;
		this.automaticClimateControl = true;
		this.windows = "Front 2 Automatic";
		this.brakes = "ABS";
		this.airBags = "Front 2";
	}

	@Override
	public void display() {
		this.toString();
	}

	@Override
	public String toString() {
		return "MiddleModel [vehicle=" + vehicle + ", accessories="
				+ accessories + ", parkingSensors=" + parkingSensors
				+ ", automaticClimateControl=" + automaticClimateControl
				+ ", windows=" + windows + ", brakes=" + brakes + ", airBags="
				+ airBags + "]";
	}

}
