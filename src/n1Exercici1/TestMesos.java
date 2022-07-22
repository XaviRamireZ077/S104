package n1Exercici1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMesos {

	
	ArrayList<String> arrayTest;
	
	@BeforeEach
     void setup() {
		arrayTest = Main.Arraymesos();
	}

	
	@Test
	void testNul() {
		assertTrue(arrayTest!=null);
		
	}
	
	@Test
	void testQuantitat() {
		assertEquals(12,arrayTest.size());
	}
	
	@Test	
	void testAgost() {
		assertEquals("Agost",arrayTest.get(7));

}
}