import static org.junit.Assert.*;

import org.junit.Test;

public class S2RectTest {

// 	instantiate Rect obj
//	public S1Rect(double length, double width) {
//		this.length = length;
//		this.width = width;
//	}
	
	
//	@Test
//	public void testGetLength() {
//		S1Rect rect = new S1Rect(3, 5);
//		assertTrue(rect.length == 3);
//		fail("Not yet implemented");
//	}
	
	
	
	@Test
	public void testGetArea() {
		S1Rect rect = new S1Rect(3, 5);
		assertTrue("multiplication error", rect.getArea() == 15);
//		fail("Not yet implemented");
	}

	
//	get area method
//	public double getArea() {
//		double area = this.length * this.width;
//		return area;
//	}
	
	
	@Test
	public void testGetPerim() {
		S1Rect rect = new S1Rect(3, 5);
		assertTrue("addition error", rect.getPerim() == 16);
//		fail("Not yet implemented");
	}
	
	
//	get perimeter method
//	public double getPerim() {
//		double perim = (2 * this.length) + (2 * this.width);
//		return perim;
//	}
	
	
	
	
	@Test
	public void test() {
		
		fail("Not yet implemented");
	}
	
	
	@Test
	public void test2() {
		fail("Not yet implemented");
	}
}
