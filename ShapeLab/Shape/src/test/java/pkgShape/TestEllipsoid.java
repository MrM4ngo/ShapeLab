package pkgShape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEllipsoid {

	Ellipsoid testEllipsoid = new Ellipsoid(5,7,9);
	
	//Test Getter & Setter
	@Test
	public void TestGetterSetter() {
		assertEquals(9, testEllipsoid.getC());
		}
	
	//Test Area
	@Test
	public void TestEllipsoidArea() {
	    assertThrows(UnsupportedOperationException.class, () -> {
	    testEllipsoid.area();
	    });
	}
	//Test perimeter
	@Test
	public void TestEllipsoidPerimeter() {
	    assertThrows(UnsupportedOperationException.class, () -> {
	    testEllipsoid.perimeter();
	    });
	}

	//Test Circumference
	@Test
	public void TestEllipsoidCircumference() {
	    assertThrows(UnsupportedOperationException.class, () -> {
	    testEllipsoid.circumference();
	    });
	}
	//Test Exceptions
	@Test
	public void TestIAE() {
	    assertThrows(IllegalArgumentException.class, () -> {
	    new Ellipsoid(-5,7,9);
	    });
	    assertThrows(IllegalArgumentException.class, () -> {
	    new Ellipsoid(5,-7,9);
	    });
	    assertThrows(IllegalArgumentException.class, () -> {
	    new Ellipsoid(5,7,-9);
	    });
	    assertThrows(IllegalArgumentException.class, () -> {
	    new Ellipsoid(-5,-7,-9);
	    });
	}
	//Test Volume
	@Test
	public void TestVolume() {
		assertEquals(1319.47, testEllipsoid.volume(), 0.01);
	}
	//Test isSpehere
	@Test
	public void TestIsSphere() {
		Ellipsoid nEllipsoid = new Ellipsoid(5,5,5);
		assertEquals(true, nEllipsoid.isSphere());
		assertEquals(false, testEllipsoid.isSphere());
	}
	
	
}
