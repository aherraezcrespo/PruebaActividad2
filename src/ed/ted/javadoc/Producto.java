package ed.ted.javadoc;

/**
 * Esta clase reune los métodos necesarios para funcionar como la multiplicación
 * de una calculadora
 * 
 * @author Andrés
 * @version 2.9
 * @since 06/02/2021
 */
public class Producto {
	
	/**
	 * Multiplicación de dos números reales
	 * 
	 * @param A número real
	 * @param B número real
	 * @return multipliación de A y B
	 */
	public double MultiplicacionReales(double A, double B) {
		double multiplicacion = A * B;
		return multiplicacion;
	}
	
	
	
	/**
	 * Caso especial: si intentamos multiplicar por la raiz de un número negativo. 
	 * La raíz de un número negativo no es un número real, por lo que daría error la calculadora.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * /

	/**
	 * Multiplicación de dos números enteros
	 * 
	 * @param A número entero
	 * @param B número entero
	 * @return multipliación de A y B
	 */
	public int MultiplicacionEnteros(int A, int B) {
		int multiplicacion = A * B;
		return multiplicacion;
	}

	/**
	 * Multiplicación de tres números reales
	 * 
	 * @param A número real
	 * @param B número real
	 * @param C número real
	 * @return multipliación de A, B y C
	 */
	public double MultiplicacionTresReales(double A, double B, double C) {
		double multiplicacion = A * B * C;
		return multiplicacion;
	}

	/**
	 * Potencia
	 * 
	 * Caso especial: si los numeros pasados como parametro son muy grandes
	 * el resultado tiene a infinito y se representara con la palabra "Infinity"
	 * 
	 * @param A número real
	 * @param B número real
	 * @return Potencia de A elevado a B
	 * 
	 * 
	 */
	public double Potencia(double A, double B) {
		double Potencia = Math.pow(A, B);
		return Potencia;
	}

}
