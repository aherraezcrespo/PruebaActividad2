package ed.ted.javadoc;

/**
 * Esta clase reune los metodos necesarios para actuar como la resta de una calculadora
 * @author Alejandro
 * @version 2.3
 * @since 29/01/2021
 *
 */

public class Resta {
	
	/**
	 * Resta de dos numeros reales
	 * @param X numero real
	 * @param Y numero real 
	 * @return resta de X e Y
	 */
	
	public double restaReales(double x, double y) {
		double resta = x-y;
		
		return resta;
	}
	
	/**
	 * Resta de dos numeros enteros
	 * 
	 * Caso especial: este metodo no funcionaria si utilizamos para uno de los dos numeros una constante como por ejemplo E
	 * 
	 * @param X numero entero
	 * @param Y numero entero
	 * @return resta de X e Y
	 */
	
	public int restaEnteros(int x, int y) {
		int resta = x-y;
		
		return resta;
	}
	
	/**
	 * Resta de tres numeros reales 
	 * @param X numero real
	 * @param Y numero real
	 * @param Z numero real
	 * @return resta de X,Y y Z
	 */
	
	public double restaTresReales(double x, double y, double z) {
		double resta = x-y-z;
		
		return resta;
	}
	
	
	/**
	 * Resta de tres numeros enteros 
	 * @param x numero entero
	 * @param y numero entero
	 * @param z numero entero
	 * @return resta de X,Y y Z
	 */
	
	public int restaTresEnteros(int x, int y, int z) {
		int resta = x-y-z;
		
		return resta;
	}
	
	/**
	 * Resta con valor acumulado 
	 * @param X numero entero
	 * @return no devuelve nada, la clase guarda el valor acumulado
	 */
	
	public void restaValorAcumulado(int x) {
		x--;
	}
	
	
	
	

}
