package com.nagarro.designpatterns.builderAnddecorator;

public class Car implements Vehicle {

	private final boolean bootomBase;
	private final boolean tyres;
	private final boolean body;
	private boolean engine;
	private boolean interirors;
	private boolean wirings;
	private boolean bodyPaint;

	public Car(final boolean bootomBase, final boolean tyres, final boolean body) {
		this.bootomBase = bootomBase;
		this.tyres = tyres;
		this.body = body;
	}

	public Car addEngine(final boolean engine) {
		this.engine = engine;
		return this;
	}

	public Car addInteriors(final boolean interiors) {
		this.interirors = interiors;
		return this;
	}

	public Car addWirings(final boolean wirings) {
		this.wirings = wirings;
		return this;
	}

	public Car addBodyPaint(final boolean bodyPaint) {
		this.bodyPaint = bodyPaint;
		return this;
	}

	@Override
	public void display() {
		this.toString();
	}

	@Override
	public String toString() {
		return "Car [bootomBase=" + bootomBase + ", tyres=" + tyres + ", body="
				+ body + ", engine=" + engine + ", interirors=" + interirors
				+ ", wirings=" + wirings + ", bodyPaint=" + bodyPaint + "]";
	}
}
