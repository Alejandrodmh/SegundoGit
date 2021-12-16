package LaOca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OcaTest2 {
	Casilla tablero[];

	@BeforeEach
	void before() {
		tablero = new Casilla[63];
		for (int i = 0; i < tablero.length; i++) {
			tablero[i] = Casilla.blanco;
		}
	}

	@Test
	void testColocarPosada() {

		Oca.colocarPosada(tablero);
		int posada = 19;
		comprobarPosicion(Casilla.posada, posada);
	}

	@Test
	void testColocarPozo() {
		Oca.colocarPozo(tablero);
		int pozo = 31;
		comprobarPosicion(Casilla.pozo, pozo);
	}

	@Test
	void testColocarPuente() {
		Oca.colocarPuente(tablero);
		int puente1 = 12;
		int puente2 = 23;
		comprobarPosicion(Casilla.puente, puente1);
		comprobarPosicion(Casilla.puente, puente2);
	}

	@Test
	void testColocarOca() {
		Oca.colocarOca(tablero);
		int oca = 0;
		for (int i = 0; i < 63; i++) {
			if (i % 9 == 0) {
				oca = i;
			}
			comprobarPosicion(Casilla.oca, oca);
		}
	}

	public void comprobarPosicion(Casilla tipo, int posicion) {
		for (int i = 0; i < tablero.length; i++) {
			if (i != posicion - 1) {
				assertNotEquals(tipo, tablero[i]);
			} else {
				assertEquals(tipo, tablero[posicion - 1]);
			}
		}

	}
}
