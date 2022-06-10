package com.example.designpattern.Prototype;

public class Circle extends Shapes{
	
	private int diameter;

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	@Override
	public String toString() {
		return "Circle [diameter=" + diameter + "]";
	}
	
	
	

}
