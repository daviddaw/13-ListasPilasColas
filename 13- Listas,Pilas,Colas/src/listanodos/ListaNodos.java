package listanodos;

import Pilas.NodoSimple;

public class ListaNodos<E> implements IListaNodos<E> {
//Atributos
	 Nodo<E>  head;
	 int size;
	//Constructor 
	public ListaNodos() {
		
		this.head = null;
		this.size = 0;
	}
	
	
	@Override
	public void meterElemento(Nodo<E> e) {
		// Siempre sera la cabecera el  elemento que insertemos en la pila pero si habia alguno antes guardaremos su informacion en el siguiente nodo y al que traigamos lo ,eteremos en cabecera
		Nodo<E> nodo = new Nodo<E>();
		nodo.siguiente = head;
		head= nodo;
		
	}
	
	
	
	@Override
	public boolean isEmpty() {
		
		return false;
	}
	@Override
	public Nodo<E> first() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public Nodo<E> last() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void addFisrt(Nodo<E> newNodo) {
		if (newNodo ==null) {
			System.out.println("EL nodo es nuloo podemos insertarlo");
			return;
		}
		newNodo.siguiente=head;
	
		head=newNodo;
		size++;
	}	

	
	@Override
	public void addLast(Nodo<E> newNodo) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeLast() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeFirst() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remove(E e) {
		// TODO Auto-generated method stub
		
	}
	public void show() {
		if (isEmpty())
			System.out.println("La lista está vacia");
		else {
			Nodo<E> aux=head;
		while (aux!=null) {
			System.out.println(aux.elemento.toString() + ",");
			//aux.verSNode();
			aux=aux.siguiente;
		}
		System.out.println();
		}
		
	}


	
	 
	 
	 
}
