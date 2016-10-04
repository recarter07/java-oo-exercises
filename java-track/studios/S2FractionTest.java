import static org.junit.Assert.*;

import org.junit.Test;

public class S2FractionTest {

	
// 	instantiate Fraction obj
//	public S1Fraction(int numer, int denom) {
//		this.numer = numer;
//		this.denom = denom;
//	}
		
	
// OTHER METHODS
//	get numer
//	public int getNumer() {
//		int numer = this.numer;
//		return numer;
//	}
	
	
	
	@Test
	public void testGetNumer() {
		S1Fraction fract = new S1Fraction (5, 6);
		assertTrue("getNumer error", fract.getNumer() == 5);
//		fail("Not yet implemented");
	}

	
	@Test
	public void testGetDenom() {
		S1Fraction fract = new S1Fraction (5, 6);
		assertTrue("getDenom error", fract.getDenom() == 6);
//		fail("Not yet implemented");
	}
	
	
	
}
