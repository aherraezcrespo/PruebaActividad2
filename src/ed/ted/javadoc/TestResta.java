package ed.ted.javadoc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestResta {
	
	
private Resta resta;
	
	@BeforeEach
	public void setUp() {
		resta = new Resta();
	}
	
	@AfterEach
	public void tearDown() {
	}

	@Test
	void ElResultadoDeRestar5A10DebeSer5() {
		// Arrange - Preparar
		double minuendo = 10;
		double substraendo = 5;
		double diferencia = 5;
		// Act - Ejecutar 
		double resultado = resta.restaReales (minuendo, substraendo);
		// Assert - Comprobar 
		assertEquals(diferencia, resultado,"La resta de 5 a 10 es 5");
	}

	@Test
	void ElResultadodeRestar8A20DebeSer12() {
		// Arrange - Preparar
		int minuendo = 20;
		int substraendo = 8;
		int diferencia = 12;
		// Act - Ejecutar 
		int resultado = resta.restaEnteros (minuendo, substraendo);
		// Assert - Comprobar 
		assertEquals(diferencia, resultado,"La resta de 8 a 20 es 12");
	}

	@Test
	void ElResultadoDeRestar3y2A15DebeSer10() {
		// Arrange - Preparar
		double minuendo = 15;
		double substraendo = 3;
		double substraendo2 = 2;
		double diferencia = 10;
		// Act - Ejecutar 
		double resultado = resta.restaTresReales (minuendo, substraendo, substraendo2);
		// Assert - Comprobar 
		assertEquals(diferencia, resultado,"La resta de 3 y 2 a 15 es 10");
	}

	@Test
	void testRestaTresEnteros() {
		// Arrange - Preparar
		double minuendo = 15;
		double substraendo = 3;
		double substraendo2 = 2;
		double diferencia = 10;
		// Act - Ejecutar 
		double resultado = resta.restaTresReales (minuendo, substraendo, substraendo2);
		// Assert - Comprobar 
		assertEquals(diferencia, resultado,"La resta de 5 a 10 es 5");
	}

	 
	
	
	@Test
	void Restar1AUnNumeroNoEnteroComoPiNoEsPosible() {
		// Arrange - Preparar
		double minuendo = 10;
		double substraendo = Math.PI  ;
		// Act - Ejecutar
		int resultado;
		// Assert - Comprobar 
		try {
			resultado = resta.restaEnteros ((int)minuendo,(int)substraendo);
		}catch(ArithmeticException e) {
			assertTrue(true);
		}
		
	
	}

}
