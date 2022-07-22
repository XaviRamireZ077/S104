package n1Exercici2;


public class CalculoDni {

	public static char calcularLletra(int dni) {
		char [] caracteres = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };
		int resto = dni % 23;
		char lletra;
		return lletra = caracteres[resto];
	}


	}


