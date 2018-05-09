package listanodos; //Package

public class Nodo<E> {//nombre parametrizado
	//Atributos
	// tipo nombre
	E elemento;
	//     Contructor
	//tipo<E>  nombre
	Nodo<E> siguiente;
	//contructor
	
	
	public Nodo(E elemento, Nodo<E> siguiente) {
		this.elemento = elemento;
		this.siguiente = siguiente;
	}

	public Nodo() {
		
		this.elemento = null;
		this.siguiente = null;
	}

	public Nodo(E obj) {
		elemento=obj;
		siguiente=null;
	}

	public E getElemento() {
		return elemento;
	}

	public void setElemento(E elemento) {
		this.elemento = elemento;
	}

	public Nodo<E> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo<E> siguiente) {
		this.siguiente = siguiente;
	}

	public void verNodo() {
		System.out.println(elemento.toString());
	}

	
}
