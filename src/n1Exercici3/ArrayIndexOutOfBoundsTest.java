package n1Exercici3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayIndexOutOfBoundsTest {
	
	
	ArrayList<String> arrayTest;
	@BeforeEach
	void setUp() {
	arrayTest = ArrayIndexOutOfBounds.llistaExcepcio();	
		
	}

	
	@Test
	void test() {
		assertTrue(arrayTest != null);
	}

}
