package nivel3;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Optional;

public class AssertJ {
	/*Exercici 1. Una asserci� que demostri que el valor de dos objectes 
	sencers �s igual, i una altra que indiqui que no ho �s.*/
	@Test
	public void comprobacionNumeros() {
		int a = 100;
		int b =90;
		assertThat(a).isEqualTo(a);
		assertThat(b).isNotEqualTo(a);
	}
	
	/*Exercici 2. Una asserci� que demostri que la refer�ncia
	a un objecte �s la mateixa que una altra, i una altra 
	que indiqui que �s diferent.*/
	
	@Test
	public void refObj() {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();
		obj2 = obj3;
		
		assertThat(obj3).isEqualTo(obj2);
		assertThat(obj1).isNotEqualTo(obj2);
	}
	
	/*Exercici 3. Una asserci� que indiqui que dues arrays
	d'enters s�n id�ntics.*/
	
	@Test
	public void Arrays() {
		int [] list = {1,2,3};
		int [] list2 = {1,2,3};
		
		assertThat(list).isEqualTo(list2);
	}
	
	/*Exercici 4. Crea un array list contenidor de diversos 
	tipus d'objectes (creu-los tamb�). Escriu una asserci�
	per a verificar l'ordre dels objectes en el ArrayList
	segons van ser inserits.
	Ara verifica que la llista anterior cont� els objectes
	en qualsevol ordre.
	Verifica que, en la llista anterior, un dels objectes 
	s'ha afegit nom�s una vegada. Deixa un dels elements 
	sense afegir, i verifiqui no la llista no cont� aquest �ltim.*/
	
	@Test
	public void ArrayList() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(7);
		numeros.add(9);
		numeros.add(10);
		numeros.add(12);

		assertThat(numeros).isSorted();
		assertThat(numeros).contains(9,10,12);
		assertThat(numeros).containsOnlyOnce(9);
		assertThat(numeros).doesNotContain(11);

	}
	
	/*Exercici 5. Crea un map i verifica que cont� una de
	les key que li afegeixi.*/
	
	@Test
	public void map() {
		LinkedHashMap<Integer,String> Map = new LinkedHashMap<Integer,String>();
		
		Map.put(7,"Mario");
		Map.put(8,"Laura");
		Map.put(9,"Gemma");
		
		assertThat(Map).containsKey(7);
		
	}
	/*Exercici 6. Provoca una ArrayIndexOutOfBoundsException 
	en una classe qualsevol. Creu una asserci� que validi 
	que l'excepci� �s llan�ada quan correspon.*/
	
	@Test
	public void exception() {
		ArrayList<Integer> llista = new ArrayList<Integer>();
		llista.add(7);
		llista.add(9);
		llista.add(11);
		assertThatExceptionOfType(IndexOutOfBoundsException.class)
        .isThrownBy(() -> {
         llista.get(3);
      });
	}
	
	/*Exercici 7. Crea un objecte Optional buit. 
	Escriu l'asserci� correcta per a verificar que 
	efectivament est� buit.*/
	
	@Test
	public void buit() {
		 Optional<String> buit = Optional.empty();
		    assertFalse(buit.isPresent());
		
		
	}
}
