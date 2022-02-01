package nivel1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Ejercicio2 {
	/*Crea una classe anomenada CalculoDni que calculi 
	la lletra del DNI en rebre el número com a paràmetre. 
	Crea una classe jUnit que verifiqui el seu correcte funcionament, 
	parametritzant-la perquè el test rebi un espectre de dades
	ampli i validi si el càlcul és correcte per a 10 números de DNI predefinits.*/
	
	
	@Test
	void testcalculoDNI() {
		
		
		CalculoDNI dni = new CalculoDNI(5032077);
		
		assertEquals(dni.getLetra(),"K");
		
		
			
		}
		
		
		
	}


