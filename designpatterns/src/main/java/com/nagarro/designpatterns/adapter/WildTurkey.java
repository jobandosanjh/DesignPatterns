package com.nagarro.designpatterns.adapter;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("Gobble gobble");
	}
}
