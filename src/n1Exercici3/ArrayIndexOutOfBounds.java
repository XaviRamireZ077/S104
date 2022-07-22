package n1Exercici3;

import java.util.ArrayList;

public class ArrayIndexOutOfBounds {

public static ArrayList<String> llistaExcepcio()throws ArrayIndexOutOfBoundsException {
		ArrayList<String> equipos = new ArrayList<String>();
		equipos.add("FC Barcelona");
		equipos.add("Liverpool");
		equipos.add("Bayern Munich");
		equipos.add("Juventus");
		
		if (equipos.size()>= 5) {
			throw new ArrayIndexOutOfBoundsException("Aquest array no disposa de tants elements");
			
		}else {
	       for (String equipo : equipos ); 
		}
			
	   return equipos;
		
	}

}
