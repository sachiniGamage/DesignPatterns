package com.example.designpattern.Prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
	
	private Map<ShapeType,Shapes> shape = new HashMap<>();
	
	public ShapeCache() {
		this.initialize();
	}
	
	public Shapes getShape(ShapeType shapeType) {
		Shapes shapes = null;
		try {
			 shapes = (Shapes) shape.get(shapeType).clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return shapes;
	}

	private void initialize() {
		
		Circle c = new Circle();
		c.setDiameter(5);
		c.setHeight(4);
		c.setWidth(4);
		
		Square s = new Square();
		s.setArea(16);
		s.setHeight(4);
		s.setWidth(4);
		
		shape.put(ShapeType.circle, c);
		shape.put(ShapeType.square, s);
		
	}

}
