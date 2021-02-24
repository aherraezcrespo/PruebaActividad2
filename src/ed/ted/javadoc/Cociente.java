package ed.ted.javadoc;

/**
 * Esta clase re�ne los m�todos necesarios para funcionar como el cociente de
 * una calculadora
 * 
 * @author Irene
 * @version 2.1
 * @since 07/02/2021
 */
public class Cociente {
	/**
	 * Cociente de dos n�meros reales
	 * 
	 * Caso especial: si el parametro B es igual a 0, la calculadora dara error y no representara el resultado correcto
	 * 
	 * @param A n�mero real
	 * @param B n�mero real
	 * @return cociente de A y B
	 */
	public double cocienteReales(double A, double B) {
		double cociente = A / B;
		return cociente;
	}

	/**
	 * Caso especial: si el parametro B es igual a 0, la calculadora dara error y no representara el resultado correcto
	 * 
	 * Cociente de dos n�meros enteros
	 * 
	 * @param A n�mero entero
	 * @param B n�mero entero
	 * @return cociente de A y B
	 */
	public int cocienteEnteros(int A, int B) {
		int cociente = A / B;
		return cociente;
	}

	/**
	 * Caso especial: si el n�mero introducido como parametro A es igual al valor 0, dara error
	 * 
	 * Inverso de un n�mero real
	 * 
	 * @param A n�mero real
	 * @return cociente de 1 y A
	 */
	public double cocienteInverso(double A) {
		double cociente = 1 / A;
		return cociente;
	}

	/**
	 * Ra�z de un n�mero real
	 * 
	 * 
	 * Caso especial: si el numero introducido como parametro es negativo la calculadora 
	 * dara error y no representara ningun resultado
	 *
	 * 
	 * @param A n�mero real
	 * @return ra�z cuadrada de A
	 */
	public double cocienteRaiz(double A) {
		double cociente = Math.sqrt(A);
		return cociente;
	}
}
