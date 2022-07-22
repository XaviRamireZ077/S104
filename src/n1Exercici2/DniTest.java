package n1Exercici2;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class DniTest {

	@Test
	void calcularLletra() {

		char lletra = CalculoDni.calcularLletra(24936322);
		assertEquals('K', lletra);
		char lletra1 = CalculoDni.calcularLletra(95708173);
		assertEquals('K', lletra1);
		char lletra2 = CalculoDni.calcularLletra(84143158);
		assertEquals('G', lletra2);
		char lletra3 = CalculoDni.calcularLletra(29120844);
		assertEquals('S', lletra3);
		char lletra4 = CalculoDni.calcularLletra(88340390);
		assertEquals('N', lletra4);
		char lletra5 = CalculoDni.calcularLletra(82984502);
		assertEquals('L', lletra5);
		char lletra6 = CalculoDni.calcularLletra(90025456);
		assertEquals('Y', lletra6);
		char lletra7 = CalculoDni.calcularLletra(23915884);
		assertEquals('R', lletra7);
		char lletra8 = CalculoDni.calcularLletra(86893608);
		assertEquals('E', lletra8);
		char lletra9 = CalculoDni.calcularLletra(47831452);
		assertEquals('P', lletra9);

	}

}
