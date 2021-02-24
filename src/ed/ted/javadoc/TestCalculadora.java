package ed.ted.javadoc;

public class TestCalculadora {

	public static void main(String[] args) {

		// TEST RESTA
		
		// Probamos metodo restaTresEnteros

		Resta pruebaResta = new Resta();

		System.out.println("El resultado para los parametros introducidos es: " 
							+ pruebaResta.restaTresEnteros(10, 7, 2));
		
		
		
		// TEST PRODUCTO
		
		// Usamos el metodo MultiplicacionEnteros
		
		Producto pruebaProducto = new Producto();
		
		System.out.println("El resultado de la operación es: "
				           + pruebaProducto.MultiplicacionEnteros(2, 3));
		
		
		
		//  TEST COCIENTE
		
		//Probamos metodo cocienteDosEnteros
				
	    Cociente pruebaCociente = new Cociente();
				
		System.out.println("El resutado para los parametros introducidos es:"
						+ 		      + pruebaCociente.cocienteEnteros(10, 2));
		
		}
		
		
		

	}


