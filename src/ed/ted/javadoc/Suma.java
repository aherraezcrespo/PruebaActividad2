package ed.ted.javadoc;

/**
 * Esta clase reune los metodos necesarios para actuar como la suma de una
 * calculadora
 * 
 * @author Conrado
 * @version 1.0
 * @since 30/01/2021
 */
public class Suma {
	/**
	 * Suma de dos numeros reales
	 * 
	 * @param A numero real
	 * @param B numero real
	 * @return suma de A y B
	 */
	public double sumaReales(double a, double b) {
		double suma = a + b;
		return suma;
	}

	/**
	 * Suma de dos numeros enteros
	 * 
	 * Caso especial: este metodo no funcionaria si utilizamos para uno de los dos numeros una constante como por ejemplo PI
	 * 
	 * @param A numero entero
	 * @param B numero entero
	 * @return suma de A y B
	 */
	public int sumaEnteros(int a, int b) {
		int suma = a + b;
		return suma;
	}

	/**
	 * Suma de tres numeros reales
	 * 
	 * @param A numero real
	 * @param B numero real
	 * @param C numero real
	 * @return suma de A,B Y C
	 */
	public double sumaTresReales(double a, double b, double c) {
		double suma = a + b + c;
		return suma;
	}

	/**
	 * Suma con valor acumulado
	 * 
	 * @param A numero entero
	 * @return no devuelve nada, la clase guarda en el valor acumulado
	 */
	public void sumaValorAcumulado(int a) {
		a--;
	}
}