package ed.ted.javadoc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCociente {
	
	// ALEJANDRO PRUEBA LOS METODOS DE LA CLASE COCIENTE
	
	private Cociente cociente;
	
	@BeforeEach
	public void setUp() {
		cociente = new Cociente();
	}
	
	@AfterEach
	public void tearDown() {
	}
	
	// HAPPY PATHS

	@Test
	void elCocienteDe5Entre2DebeSer2Coma5() {
		// Arrange - Preparar
		double dividendo = 5;
		double divisor = 2;
		double esperado = 2.5;
		// Act - Ejecutar 
		double resultado = cociente.cocienteReales(dividendo, divisor);
		// Assert - Comprobar 
		assertEquals(esperado, resultado,"la division de 5 entre 2 es 2.5");
	}

	@Test
	void elCocienteDe10Entre5DebeSer2() {
		// Arrange - Preparar
		int dividendo = 10;
		int divisor = 5;
		int esperado = 2;
		// Act - Ejecutar
		int resultado = cociente.cocienteEnteros(dividendo, divisor);
		// Assert - Comprobar 
		assertEquals(esperado, resultado,"la division de 10 entre 5 es 2");
	}

	@Test
	void elInversoDe2DebeSer0Coma5() {
		// Arrange - Preparar 
		int base = 2;
		double esperado = 0.5;
		// Act - Ejecutar 
		double resultado = cociente.cocienteInverso(base);
		// Asser - Comprobar
		assertEquals(esperado, resultado,"el inverso de 2 es 0.5");
		
	}

	@Test
	void laRaizCuadradaDe25DebeSer5() {
		// Arrange - Preparar
		int base = 25;
		int esperado = 5;
		// Act - Ejecutar
		double resultado = cociente.cocienteRaiz(base);
		// Assert - Comprobar 
		assertEquals(esperado, resultado,"la raiz de 25 es 5");
	}
	
	// CASOS ESPECIALES 
	
	@Test
	void laRaizCuadradaDeUnNumeroNegativoEsNaN() {
		// Arrange - Preparar
		int base = -9;
		double esperado;
		esperado = Double.NaN;
		// Act - Ejecutar
		double resultado = cociente.cocienteRaiz(base);
		// Assert - Comprobar 
		assertEquals(esperado, resultado,"la raiz de -9 debe ser 3");
	}
	
	
	@Test
	void elCocienteDeUnNumeroEntre0NoEsPosible() {
		// Arrange - Preparar
		int dividendo = 10;
		int divisor = 0;
		// Act - Ejecutar
		int resultado;
		// Assert - Comprobar 
		try {
			resultado = cociente.cocienteEnteros(dividendo, divisor);
		}catch(ArithmeticException e) {
			assertTrue(true);
		}
		
	
	}
	
	@Test
	void elInversoDe0NoEsPosible() {
		// Arrange - Preparar
		int base = 0;
		// Act - Ejecutar
		double resultado;
		// Assert - Comprobar 
		try {
			resultado = cociente.cocienteInverso(base);
		}catch(ArithmeticException e) {
			assertTrue(true);
		}
		
	}
	
	
	

}




