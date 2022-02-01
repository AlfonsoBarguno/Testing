package nivel1;

public class CalculoDNI {

	/*
	 * Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre
	 * el n�mero com a par�metre. Crea una classe jUnit que verifiqui el seu
	 * correcte funcionament, parametritzant-la perqu� el test rebi un espectre de
	 * dades ampli i validi si el c�lcul �s correcte per a 10 n�meros de DNI
	 * predefinits.
	 */

	private String letra;

	public CalculoDNI(int pepe) {
		String juegoCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
		int modulo = pepe % 23;
		this.letra = juegoCaracteres.charAt(modulo) + "";
	}

	public String getLetra() {
		return letra;
	}
}
