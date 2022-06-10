package com.example.designpattern.Factory;

public class ChocolateBT extends Taste{
	@Override
	protected void createTaste() {
		biscuits.add(new ChocoT());
	}
}
