package pkgShape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEllipse {
	Ellipse testEllipse = new Ellipse(5,7);
 
	
	//Test Getter & Setter
	@Test
	public void TestGetterSetter() {
		assertEquals(7, testEllipse.getMinorAxis());
		}
	
	//Test Area
	@Test
	public void TestAreaTrue() {
		assertEquals(109.96, testEllipse.area(), 0.01);
	}
	
	//Test Perimeter
	@Test
	public void TestPerimeterTrue() {
		assertEquals(37.96, testEllipse.perimeter(), 0.01);
	}
	
	//Test Circumference
	@Test
	public void TestCircumferenceTrue() {
		assertEquals(37.96, testEllipse.circumference(), 0.01);
	}
	
	//Test Exceptions
	@Test
	public void TestIAE() {
	    assertThrows(IllegalArgumentException.class, () -> {
	    new Ellipse(5,-7);
	    });
	}
	
	//Test Circle
	@Test
	public void TestIsCircle() {
		Ellipse nTestEllipse = new Ellipse(5,5);
		assertEquals(true, nTestEllipse.isCircle());
		assertEquals(false, testEllipse.isCircle());
	}
}
