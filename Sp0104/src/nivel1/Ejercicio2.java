package nivel1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Ejercicio2 {
	/*Crea una classe anomenada CalculoDni que calculi 
	la lletra del DNI en rebre el n�mero com a par�metre. 
	Crea una classe jUnit que verifiqui el seu correcte funcionament, 
	parametritzant-la perqu� el test rebi un espectre de dades
	ampli i validi si el c�lcul �s correcte per a 10 n�meros de DNI predefinits.*/
	
	
	@Test
	void testcalculoDNI() {
		
		
		CalculoDNI dni = new CalculoDNI(5032077);
		
		assertEquals(dni.getLetra(),"K");
		
		
			
		}
		
		
		
	}


