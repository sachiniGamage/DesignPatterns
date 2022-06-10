package com.example.designpattern.Factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Taste {
	
	protected List<BiscuitFactory> biscuits = new ArrayList<>();
	
	public Taste() {
		createTaste();
	}
	
	protected abstract void createTaste();
	
	@Override
	public String toString() {
		return "Taste{" +
					"biscuits = " + biscuits + '}';
	}

}
