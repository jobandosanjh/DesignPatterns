package com.nagarro.designpatterns.builderAnddecorator;

public class Client {

	public static void main(final String[] args) {
		final Car car = new Car(true, true, true);
		car.addBodyPaint(true);
		car.addEngine(true);
		car.addInteriors(true);
		car.addWirings(true);
		System.out.println(car);

		System.out.println(new BaseModel(car));
		System.out.println(new MiddleModel(car));
		System.out.println(new TopModel(car));
	}

}
