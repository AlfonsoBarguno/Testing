package nivel1;

import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class Ejercicio3 {
	/*
	 * Crea una classe amb un mètode que llanci una ArrayIndexOutOfBoundsException.
	 * Verifica el seu correcte funcionament amb un test jUnit.
	 */

	@Test
	void testExpectedException() {
		int[] numeros = { 0, 1, 2, 3, 4, 5 };
		// int numero= numeros[10]; // Asi es en la version nueva de junit

		// assertThrows espera que se lance esa excepcion dentro de ese trozo de codigo
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			int numero = numeros[10];
		});
	}
}
