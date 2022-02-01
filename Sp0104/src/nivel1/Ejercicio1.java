package nivel1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Ejercicio1 {

	
	
	/*Crea una classe Java que insereixi en una llista 
	ordenada els noms dels mesos de l'any. 
	Verifica amb jUnit que la llista t� 12 posicions,
	que no �s nul�la i que en la seva posici� 8 cont� el nom 'Agost'.*/
	
	@Test
	void dotzePosicions() {
		
		ArrayList<String> meses = new ArrayList<String>(
				Arrays.asList("Enero","Febrero", "Marzo", "Abril", "Mayo","Junio","Julio", 
						"Agosto","Septiembre", "Octubre","Noviembre","Diciembre"));
     assertEquals(meses.size(),12);
	
	
	}
	@Test
	void nula() {
		ArrayList<String> meses = new ArrayList<String>(
				Arrays.asList("Enero","Febrero", "Marzo", "Abril", "Junio","Julio", 
						"Agosto","Septiembre", "Octubre","Noviembre","Diciembre"));
		assertNotNull(meses);
	}
	@Test
	void nomAgost() {
		ArrayList<String> meses = new ArrayList<String>(
				Arrays.asList("Enero","Febrero", "Marzo", "Abril", "Mayo", "Junio","Julio", 
						"Agosto","Septiembre", "Octubre","Noviembre","Diciembre"));
		assertEquals(meses.get(7),"Agosto");
	}

}
