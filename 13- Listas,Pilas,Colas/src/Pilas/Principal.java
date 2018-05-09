package Pilas;

public class Principal {

	public static void main(String[] args) {
		Pila<String> pila = new Pila<String>();
		
/*	
 * 	2* [(5+x)-(y+z)])-3  sería incorrecta 
 *  (2* [(5+x)-(y+z)])-3 sería correcta	
*/


		
		pila.meterElemento("Hola");
		System.out.println("La cima es "+pila.mostrarCima());
		pila.meterElemento("Buenos Dias");
		
		System.out.println("Longitud "+pila.longitud);
		System.out.println("La cima es "+pila.mostrarCima());
		System.out.println("Longitud "+pila.longitud);
		pila.meterElemento("Adios");
		System.out.println("La cima es "+pila.mostrarCima());
		System.out.println("sacar elemento "+pila.sacarElemento());
		System.out.println("La nueva cima es "+pila.mostrarCima());
		
		System.out.println("¿La pila esta vacia? "+pila.vacia());
		
		//lista.addFisrt(new Nodo<Integer>(i));

	}

}
