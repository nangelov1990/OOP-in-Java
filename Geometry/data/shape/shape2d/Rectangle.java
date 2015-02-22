package data.shape.shape2d;

import java.util.ArrayList;
import java.util.Arrays;

import data.vertex.Vertex2D;

public class Rectangle extends PlaneShape {
	private double width;
	private double height;

	public Rectangle(Vertex2D firstVertex, double width, double height) {
		super(new ArrayList<Vertex2D>(Arrays.asList(firstVertex)));
		setWidth(width);
		setHeight(height);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if (width == 0) {
			throw new ArithmeticException("Not a rectangle!");
		}
		
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height == 0) {
			throw new ArithmeticException("Not a rectangle!");
		}
		
		this.height = height;
	}

	@Override
	public double getArea() {
		double area = getWidth() * getHeight();
		
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter = getWidth() * 2 + getHeight() * 2; 
		
		return perimeter;
	}

}
