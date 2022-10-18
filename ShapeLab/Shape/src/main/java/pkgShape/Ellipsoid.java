package pkgShape;
public class Ellipsoid extends Ellipse{
	
double c;

public Ellipsoid(){
	super();
 } 

public Ellipsoid(double a, double b, double c){
	super();
	this.setRadius(a);
	this.setMinorAxis(b);
	this.setC(c);
}

public double getC() {
	return c;
}
public void setC(double C) {
	if (C<=0) {
		throw new IllegalArgumentException();
	}
	this.c = C;
}

public double area() {
	throw new UnsupportedOperationException();
}
public double circumference() {
	throw new UnsupportedOperationException();
}
public double perimeter() {
	throw new UnsupportedOperationException();
}

public double volume(){
	double a = getRadius();
	double b = getMinorAxis();
    return ((4/3.0)*Math.PI*a*b*c);
}
public boolean isSphere(){
	double a = getRadius();
	double b = getMinorAxis();
	return (a == b && b == c);
}
//End Class }
}
