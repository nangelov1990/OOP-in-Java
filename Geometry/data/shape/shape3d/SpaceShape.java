package data.shape.shape3d;

import java.util.List;

import interfaces.AreaMeasurable;
import interfaces.VolumeMeasurable;
import data.shape.Shape;
import data.vertex.Vertex3D;

public abstract class SpaceShape
		extends Shape
		implements AreaMeasurable, VolumeMeasurable {
	public SpaceShape(List<Vertex3D> vertices) {
		super((List)vertices);
	}
	
	@Override
	public String toString() {
		String spaceShape = String.format(
				" Area = %.2f, Volume = %.2f;\n",
				this.getArea(),
				this.getVolume());
		
		return super.toString() + spaceShape;
	}
}
