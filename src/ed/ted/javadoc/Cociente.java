package ed.ted.javadoc;

/**
 * Esta clase reúne los métodos necesarios para funcionar como el cociente de
 * una calculadora
 * 
 * @author Irene
 * @version 2.1
 * @since 07/02/2021
 */
public class Cociente {
	/**
	 * Cociente de dos números reales
	 * 
	 * Caso especial: si el parametro B es igual a 0, la calculadora dara error y no representara el resultado correcto
	 * 
	 * @param A número real
	 * @param B número real
	 * @return cociente de A y B
	 */
	public double cocienteReales(double A, double B) {
		double cociente = A / B;
		return cociente;
	}

	/**
	 * Caso especial: si el parametro B es igual a 0, la calculadora dara error y no representara el resultado correcto
	 * 
	 * Cociente de dos números enteros
	 * 
	 * @param A número entero
	 * @param B número entero
	 * @return cociente de A y B
	 */
	public int cocienteEnteros(int A, int B) {
		int cociente = A / B;
		return cociente;
	}

	/**
	 * Caso especial: si el número introducido como parametro A es igual al valor 0, dara error
	 * 
	 * Inverso de un número real
	 * 
	 * @param A número real
	 * @return cociente de 1 y A
	 */
	public double cocienteInverso(double A) {
		double cociente = 1 / A;
		return cociente;
	}

	/**
	 * Raíz de un número real
	 * 
	 * 
	 * Caso especial: si el numero introducido como parametro es negativo la calculadora 
	 * dara error y no representara ningun resultado
	 *
	 * 
	 * @param A número real
	 * @return raíz cuadrada de A
	 */
	public double cocienteRaiz(double A) {
		double cociente = Math.sqrt(A);
		return cociente;
	}
}
