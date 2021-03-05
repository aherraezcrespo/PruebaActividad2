package ed.ted.javadoc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestProducto {

	private Producto producto;
	
	@BeforeEach 
	public void setUp() {
		producto= new Producto();
	}
	
	@AfterEach
	public void tearDown() {
}
	
	@Test
	void ElResultadoDeMultiplicar5por2DebeSer10() {
		//Arrange - Preparar 
		int multiplicando = 5;
		int multiplicador = 2;
		int esperado = 10;
		//Act - Ejecutar 
		int resultado = producto.MultiplicacionEnteros(multiplicando, multiplicador);
		//Assert - Comprobar
		assertEquals(esperado, resultado, "El producto de 5 por 2 es 10");
	}
	
	@Test 
	void ElResultadoDeMultiplicar7por2DebeSer14() {
		//Arrange- Preparar
		double multiplicando = 7;
		double multiplicador = 2;
		double esperado = 14;
		//Act - Ejecutar
		double resultado = producto.MultiplicacionReales(multiplicando, multiplicador);
		//Assert - Comprobar
		assertEquals(esperado, resultado, "El prouducto de 7 por 2 es 14");
	}
	
	@Test
	void ElResultadoDeMultiplicar5por4por2DebeSer40() {
		//Arrange - Preparar
		double multiplicando = 5;
		double multiplicador = 4;
		double multiplicador2 = 2;
		double esperado = 40;
		//Act - Ejecutar
		double resultado = producto.MultiplicacionTresReales(multiplicando,multiplicador,multiplicador2);
		//Assert - Comprobar
		assertEquals(esperado, resultado, "El producto de 5 por 4 por 2 es 40");
	}
	
	@Test
	void PotenciaDe2Elevadoa4DebeSer16() { 
		//Arrange- Preparar
		double base = 2;
		double exponente = 4;
		double esperado = 16;
		//Act- Ejecutar
		double resultado = producto.Potencia(base, exponente);
		//Assert - Comprobar
		assertEquals (esperado,resultado, "La potencia de 2 elevado a 4 es 16");
	}
	
	
	@Test
	void PotenciaDe100Elevadoa100DebeTenderAInfinito() {
		//Arrange- Preparar
		double base = 100;
		double exponente = 100;
		double esperado = Double.POSITIVE_INFINITY;
		//Act - Ejecutar
		double resultado = producto.Potencia(base, exponente);
		//Assert- Comprobar
		assertEquals (esperado,resultado, "La potencia de 100 elevado a 100 tiende a infinito");
		
	}
}
