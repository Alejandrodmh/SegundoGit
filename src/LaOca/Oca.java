package LaOca;

import java.util.Random;

public class Oca {

	public static void main(String[] args) {
		Casilla tablero[];
		tablero=new Casilla[63];
		for (int i = 0; i < tablero.length; i++) {
			tablero[i]=Casilla.blanco;
			System.out.println(tablero[i]);
		}

	}
	public static void colocarPozo(Casilla[] tablero) {
		
	}

}
