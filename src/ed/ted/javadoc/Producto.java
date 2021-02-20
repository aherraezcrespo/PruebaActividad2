package ed.ted.javadoc;

/**
 * Esta clase reune los m�todos necesarios para funcionar como la multiplicaci�n
 * de una calculadora
 * 
 * @author Andr�s
 * @version 2.9
 * @since 06/02/2021
 */
public class Producto {
	
	/**
	 * Multiplicaci�n de dos n�meros reales
	 * 
	 * @param A n�mero real
	 * @param B n�mero real
	 * @return multipliaci�n de A y B
	 */
	public double MultiplicacionReales(double A, double B) {
		double multiplicacion = A * B;
		return multiplicacion;
	}
	
	
	
	/**
	 * Caso especial: si intentamos multiplicar por la raiz de un n�mero negativo. 
	 * La ra�z de un n�mero negativo no es un n�mero real, por lo que dar�a error la calculadora.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * /

	/**
	 * Multiplicaci�n de dos n�meros enteros
	 * 
	 * @param A n�mero entero
	 * @param B n�mero entero
	 * @return multipliaci�n de A y B
	 */
	public int MultiplicacionEnteros(int A, int B) {
		int multiplicacion = A * B;
		return multiplicacion;
	}

	/**
	 * Multiplicaci�n de tres n�meros reales
	 * 
	 * @param A n�mero real
	 * @param B n�mero real
	 * @param C n�mero real
	 * @return multipliaci�n de A, B y C
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
	 * @param A n�mero real
	 * @param B n�mero real
	 * @return Potencia de A elevado a B
	 * 
	 * 
	 */
	public double Potencia(double A, double B) {
		double Potencia = Math.pow(A, B);
		return Potencia;
	}

}
