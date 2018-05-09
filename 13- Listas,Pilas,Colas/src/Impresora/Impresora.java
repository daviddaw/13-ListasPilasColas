package Impresora;

public class Impresora<E> implements IOperaciones<E>{
	Nodo<E> primero, ultimo;
	int tama�o;

	@Override
	public void printWork() {//imprimo el primer elemento y lo borro porlo cual elsegundo sera el primero
		mostrarPrimero();
		borrarPrimero();	
	}
	@Override
	public void addRequest(E e) {
		insertarCola(e);//Encolar
	}
	@Override
	public void getNumRequest() {
		longitud();
		
	}
	@Override
	public void showAll() {
	//E	nodoo=mostrarPrimero();
	Nodo<E> nodo = primero;
	if (colaVacia()) {
		System.out.println("La cola esta vacia");
	}else  {
		//System.out.println("la cola tiene"+ tama�o+" elementos");
			while (nodo != null) {//tener cuidado con nodo o nodo siguiente
				System.out.println(nodo.elemento.toString());
				nodo=nodo.siguiente;

		}		
	}
	
		
	}
	@Override
	public void printAll() {

		//E	nodoo=mostrarPrimero();
		Nodo<E> nodo = primero;
		if (colaVacia()) {
			System.out.println("La cola esta vacia");
		}else  {
			
			//System.out.println("la cola tiene"+ tama�o+" elementos");
				while (nodo != null) {//tener cuidado con nodo o nodo siguiente
					  E elemento = nodo.elemento;  
					System.out.println(primero.elemento.toString());
					nodo=nodo.siguiente;     
			        primero=primero.siguiente;
			        tama�o--;
			        System.out.println("Se ha quitado "+elemento+" de la cola de solicitudes.");
					
					
					

			}		
		}
		
	}
	
	/////////////////// Metodos Predeterminados//////
	@Override
	public boolean colaVacia() {
		return tama�o==0;
	}

	@Override
	public void insertarCola(E e) {//Encolar
		Nodo<E> nodo = new Nodo<E>(e);
		if (colaVacia()) 
			primero=nodo;
	else 
		ultimo.siguiente=nodo;
		
		ultimo=nodo;		
		tama�o++;
		
		
	}
	@Override
	public void borrarPrimero() {
		if(colaVacia()) {
			System.out.println("No hay ninguna solicitud para borrar");
		}else {
	        E elemento = primero.elemento;  
	        primero=primero.siguiente;
	        tama�o--;
	        System.out.println("Se ha quitado "+elemento+" de la cola de solicitudes.");	
		}
	
	}
	@Override
	public E mostrarPrimero() {
		
		if(colaVacia()) {
			//System.out.println("No hay ninguna solicitud para imprimir");
			return null;
		}else {
			System.out.println(" Imprimiendo... "+primero.elemento);
			return primero.elemento;
		}
		
		
	}
	
	@Override
	public void longitud() {
		System.out.println("Hay "+tama�o+" solicitudes esperando en la cola");
		
	}
	


}