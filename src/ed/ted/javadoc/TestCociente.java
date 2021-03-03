package ed.ted.javadoc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCociente {
	
	private Cociente cociente;
	
	@BeforeEach
	public void setUp() {
		cociente = new Cociente();
	}
	
	@AfterEach
	public void tearDown() {
	}
	

	@Test
	void testCocienteReales() {
		fail("Not yet implemented");
	}

	@Test
	void testCocienteEnteros() {
		fail("Not yet implemented");
	}

	@Test
	void testCocienteInverso() {
		fail("Not yet implemented");
	}

	@Test
	void testCocienteRaiz() {
		// Arrange - Preparar
		int base = 25;
		int esperado = 5;
		// 2 Act - Ejecutar
		double resultado = cociente.cocienteRaiz(base);
		// Assert - Comprobar 
		assertEquals(esperado, resultado,"la raiz de 25 es 5");
	}

}




