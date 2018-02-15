package com.nagarro.designpatterns.builderAnddecorator;

public class TopModel implements Vehicle {

	private final Vehicle vehicle;
	private final boolean accessories;
	private final boolean parkingSensors;
	private final boolean automaticClimateControl;
	private final boolean childLock;
	private final boolean speedSensingLock;
	private final String windows;
	private final String brakes;
	private final String fogLights;
	private final String airbags;

	public TopModel(Vehicle vehicle) {
		this.vehicle = vehicle;
		this.accessories = true;
		this.parkingSensors = true;
		this.automaticClimateControl = true;
		this.childLock = true;
		this.speedSensingLock = true;
		this.windows = "Power";
		this.brakes = "ABS";
		this.fogLights = "Front And Rear";
		this.airbags = "2 Front And 2 Rear";
	}

	@Override
	public void display() {
		this.toString();
	}

	@Override
	public String toString() {
		return "TopModel [vehicle=" + vehicle + ", accessories=" + accessories
				+ ", parkingSensors=" + parkingSensors
				+ ", automaticClimateControl=" + automaticClimateControl
				+ ", childLock=" + childLock + ", speedSensingLock="
				+ speedSensingLock + ", windows=" + windows + ", brakes="
				+ brakes + ", fogLights=" + fogLights + ", airbags=" + airbags
				+ "]";
	}

}
