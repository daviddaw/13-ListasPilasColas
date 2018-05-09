package Pilas;

public class NodoSimple<E> {//nombre parametrizado
	E elemento;//igual
	/*public*/ NodoSimple<E> siguiente;//no se pone nombre para declarar tipos
	
	public NodoSimple() {
		this.elemento = null;
		this.siguiente = null;
	}

	public NodoSimple(E elemento, NodoSimple<E> siguiente) {
		this.elemento = elemento;
		this.siguiente = siguiente;
	}

	
	public NodoSimple(E elemento) {
		this.elemento = elemento;
		this.siguiente = null;
	}

	public E getElemento() {
		return elemento;
	}

	public NodoSimple<E> getSiguiente() {
		return siguiente;
	}

	public void setElemento(E elemento) {
		this.elemento = elemento;
	}

	public void setSiguiente(NodoSimple<E> siguiente) {
		this.siguiente = siguiente;
	}
	
	public void verNodoSimple() {
		elemento.toString();
		
	}
	
	
	
	
	
	
}
