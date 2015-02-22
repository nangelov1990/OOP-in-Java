package data.shape.shape2d;

import java.util.ArrayList;
import java.util.Arrays;

import data.vertex.Vertex2D;

public class Triangle extends PlaneShape {
	public Triangle(Vertex2D firstVertex, Vertex2D secondVertex, Vertex2D thirdVertex) {
		super(new ArrayList<Vertex2D>(Arrays.asList(firstVertex, secondVertex, thirdVertex)));
		isTriangle(getSideA(), getSideB(), getSideC());
	}

	private void isTriangle(double sideA, double sideB, double sideC) {
		if (!(sideA < (sideB + sideC))) {
			throw new ArithmeticException("Not a Triangle!");
		} else if (!(sideB < (sideA + sideC))) {
			throw new ArithmeticException("Not a Triangle!");
		} else if (!(sideC < (sideA + sideB))) {
			throw new ArithmeticException("Not a Triangle!");
		}
	}

	public double getSideA() {
		double sideA = Vertex2D.getDistance((Vertex2D)this.getVertices(0), (Vertex2D)this.getVertices(1)); 
		
		return sideA;
	}
	
	public double getSideB() {
		double sideB = Vertex2D.getDistance((Vertex2D)this.getVertices(1), (Vertex2D)this.getVertices(2)); 
		
		return sideB;
	}
	
	public double getSideC() {
		double sideC = Vertex2D.getDistance((Vertex2D)this.getVertices(2), (Vertex2D)this.getVertices(0)); 
		
		return sideC;
	}

	@Override
	public double getArea() {
		double sideA = getSideA();
		double sideB = getSideB();
		double sideC = getSideC();
		double halfPerimeter = (sideA + sideB + sideC) / 2;
		double area = Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
		
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter = getSideA() + getSideB() + getSideC();
		
		return perimeter;
	}
}
