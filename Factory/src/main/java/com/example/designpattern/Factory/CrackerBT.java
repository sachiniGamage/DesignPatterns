package com.example.designpattern.Factory;

public class CrackerBT extends Taste {
	@Override
	protected void createTaste() {
		biscuits.add(new CheeseCrackerT());
		biscuits.add(new CreamCrackerT());
	}
}
