package pkgShape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestCircle {
	

	//Test Getter & Setter
	@Test
	public void TestGetterSetter() {
		double ExpectedRadius = 5;
		Circle cGetterSetter = new Circle(5);
		assertEquals(ExpectedRadius, cGetterSetter.getRadius(), 0.01);
		}
	
	//Test Area
	@Test
	public void TestAreaTrue() {
		double ExpectedArea = 78.54;
		Circle cArea = new Circle(5);
		assertEquals(ExpectedArea,cArea.area(), 0.01);
	}

	//Test perimeter
	@Test
	public void TestPerimeterTrue() {
		double ExpectedPerimeter = 31.42;
		Circle cPerimeter = new Circle(5);
		assertEquals(ExpectedPerimeter, cPerimeter.perimeter(), 0.01);
	}

	
	//Test Circumference
	@Test
	public void TestCircumferenceTrue() {
		double ExpectedCircumference = 31.42;
		Circle cCircumference = new Circle(5);
		assertEquals(ExpectedCircumference, cCircumference.circumfrence(), 0.01);
	}

	
	//Test Exceptions
	@Test
	public void TestIAE() {
	    assertThrows(IllegalArgumentException.class, () -> {
	    new Circle(-5);
	    });
	}

}
