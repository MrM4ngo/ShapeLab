package pkgShape;
public class Circle extends Shape {

	private double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius <= 0) {
			throw new IllegalArgumentException();
		}
		this.radius = radius;
	}

	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double perimeter() {
		return ( 2*Math.PI*radius );
	}
	
	public double circumfrence() {
		return perimeter();
	}
//End Class }
}