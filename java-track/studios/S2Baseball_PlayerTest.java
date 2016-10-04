import static org.junit.Assert.*;

import org.junit.Test;

public class S2Baseball_PlayerTest {

	
	
	
	@Test
	public void testGetName() {
		S1Baseball_Player player = new S1Baseball_Player("Jorge", 10, "righty");
		assertTrue("name error", player.getName() == "Jorge");
//		fail("Not yet implemented");
	}
	
	
	@Test
	public void testGetJersey() {
		S1Baseball_Player player = new S1Baseball_Player("Jorge", 10, "righty");
		assertTrue("jersey error", player.getJersey() == 10);
//		fail("Not yet implemented");
	}

	
	@Test
	public void testGetHitter() {
		S1Baseball_Player player = new S1Baseball_Player("Jorge", 10, "righty");
		assertTrue("hitter error", player.getHitter() == "righty");
//		fail("Not yet implemented");
	}
	
	
	
}
