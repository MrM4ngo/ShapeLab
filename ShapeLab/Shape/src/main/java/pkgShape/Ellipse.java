package pkgShape;

public class Ellipse extends Circle{
	
    private double MinorAxis;
    
    public Ellipse() {
    	super();
    }
    
    public Ellipse(double radius, double minorAxis) {
    	super();
    	this.setRadius(radius);
    	this.setMinorAxis(minorAxis);
    }

	public double getMinorAxis() {
		return MinorAxis;
	}

	public void setMinorAxis(double minorAxis) {
		if (minorAxis <= 0) {
			throw new IllegalArgumentException();
		}
		this.MinorAxis = minorAxis;
	}


  public double circumference(){
	  //Using Ramanujan's Formulas for the circumference of a ellipse.
    double a = getRadius();
    double b = MinorAxis;
    double h = ( Math.pow ( ( a-b ),2) / Math.pow ( ( a+b ),2) );
    return  Math.PI * (a + b)*(1 + (( 3 * h) / (10 + (Math.pow((4 - 3*h),0.5)))));
}
  
public double perimeter() {
	return circumference();
}

public double area(){
    return Math.PI * super.getRadius() * MinorAxis;
}
public boolean isCircle(){
	double a = getRadius();
	double b = MinorAxis;
	return a == b;
}
//End Class }
}