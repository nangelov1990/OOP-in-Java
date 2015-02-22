package data.shape.shape2d;

import java.util.List;

import interfaces.AreaMeasurable;
import interfaces.PerimeterMeasurable;
import data.shape.Shape;
import data.vertex.*;

public abstract class PlaneShape
		extends Shape
		implements AreaMeasurable, PerimeterMeasurable {
	public PlaneShape(List<Vertex2D> vertices) {
		super((List)vertices);
	}
	
	@Override
	public String toString() {
		String planeShape = String.format(
				" Area = %.2f, Perimeter = %.2f;\n",
				this.getArea(),
				this.getPerimeter());
		
		return super.toString() + planeShape;
	}
}
