package com.nagarro.designpatterns.adapter;

public class DuckTestDrive {
	public static void main(String[] args) {
		final Duck duck = new MallardDuck();
		final Turkey turkey = new WildTurkey();
		final Duck turkeyAdapter = new TurkeyAdapter(turkey);

		System.out.println("The Turkey Says :");
		turkey.gobble();

		System.out.println("The Duck Says :");
		testDuck(duck);

		System.out.println("The TurkeyAdapter Says :");
		testDuck(turkeyAdapter);
	}

	private static void testDuck(final Duck duck) {
		duck.quack();
		duck.fly();
	}
}
