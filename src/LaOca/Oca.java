package LaOca;

import java.util.Random;

public class Oca {

	public static void main(String[] args) {
		Casilla tablero[];
		tablero = new Casilla[63];
		for (int i = 0; i < tablero.length; i++) {
			tablero[i] = Casilla.blanco;
			System.out.println(tablero[i]);
		}
	}

	/**
	 * cambia la naturaleza de la casilla 19( y solo esa) que pasa a ser posada
	 * 
	 * @param tablero
	 */
	public static void colocarPosada(Casilla[] tablero) {
		tablero[19 - 1] = Casilla.posada;
	}

	/**
	 * Cambia la naturaleza de la casilla 31 (solo la 31) que pasa de blanco a pozo
	 * 
	 * @param tablero
	 */
	public static void colocarPozo(Casilla[] tablero) {
		tablero[31 - 1] = Casilla.pozo;
	}

	public static void colocarPuente(Casilla[] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			if (i == 12 || i == 23) {
				tablero[i - 1] = Casilla.puente;
			}
		}
	}

	public static void colocarOca(Casilla[] tablero) {
		for (int i = 0; i < tablero.length; i++) {
			if (i % 9 == 0) {
				tablero[i - 1] = Casilla.oca;
			}
		}
	}
}
