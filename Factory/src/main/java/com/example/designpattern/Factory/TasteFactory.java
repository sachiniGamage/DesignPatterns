package com.example.designpattern.Factory;

public class TasteFactory {
	public static Taste createTaste(TasteCode testeCode) {
		switch(testeCode) {
		case Spicy:
			return new SpicyT();
		case Choco :
			return new ChocolateBT();
		case Cracker:
			return new CrackerBT();
		default:
			return null;
		}
	}
}
