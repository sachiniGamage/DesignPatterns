package com.example.designpattern.Prototype;

public abstract class Shapes implements Cloneable{
	
	private int width;
	private int height;
	
	
	
	public int getWidth() {
		return width;
	}



	public int getHeight() {
		return height;
	}



	public void setWidth(int width) {
		this.width = width;
	}



	public void setHeight(int height) {
		this.height = height;
	}



	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	

}
