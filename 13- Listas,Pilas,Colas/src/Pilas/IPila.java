package Pilas;

import listanodos.Nodo;

public interface IPila<E> {
	//Comprobar si esta vacia la pila 
	public boolean vacia();

	//Insertar elemento siempre se inserta en la cima de las pilas 
	//no digo inserta nodo digo inserta elemento
	public void meterElemento(E e);
	
	//Quitar  elemento Siempre se quita el que esta en la cima de las pilas
	public E sacarElemento();
	
	//Mostrar el elemento que esta en la cima
	public E mostrarCima();


	


	
	
}