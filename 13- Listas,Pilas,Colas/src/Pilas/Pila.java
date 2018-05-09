package Pilas;

import listanodos.Nodo;

public class Pila<E> implements IPila<E> {//Metodo
	public NodoSimple<E> cabecera;
	public int longitud;
//Constructor
	public Pila() {
		
		this.cabecera = null;
		this.longitud = 0;
	}
	
	public Pila(NodoSimple<E> cabecera) {
		this.cabecera = cabecera;
		this.longitud = 0;
	}
	
	//si en el main nos quiere modificar el constructor es por que no esta creado
		

	
	@Override
	public boolean vacia() {
		//si resulta que la pila tiene cero elementos devuelve true o lo que es lo mismo dice ue la pila esta vacia
		return longitud==0;
	}




	@Override
	public void meterElemento(E e) {
		// Siempre sera la cabecera el  elemento que insertemos en la pila pero si habia alguno antes guardaremos su informacion en el siguiente nodo y al que traigamos lo ,eteremos en cabecera
		NodoSimple<E> nodo = new NodoSimple<E>(e);
		System.out.println(e);
		System.out.println("   ");
		nodo.siguiente = cabecera;
		cabecera = nodo;
		longitud++;
		System.out.println("antes "+nodo.siguiente+" despues");
		System.out.println(nodo.elemento);
		
		
	}
	


	@Override
	public E sacarElemento() {
		if (cabecera == null) {
			return cabecera.elemento;
		}
		E borrado =  cabecera.elemento;
		cabecera= cabecera.siguiente;
		longitud--;
		return borrado;
	}

	@Override
	public E mostrarCima() {
		return cabecera.elemento;

		
	}








	

}
