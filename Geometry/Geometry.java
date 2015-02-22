import data.shape.shape2d.Rectangle;
import data.shape.shape2d.Triangle;
import data.vertex.Vertex2D;

public class Geometry {
	public static void main(String[] args) {
		System.out.println(new Triangle(new Vertex2D(2, 1), new Vertex2D(5, 1), new Vertex2D(15, 8)));
		System.out.println(new Rectangle(new Vertex2D(2, 1), 10, 20));
	}
}
