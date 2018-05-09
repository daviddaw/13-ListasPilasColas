package Ejercicios1y2;

public interface IStack<E> {
	
	//Comprobar si esta vacia la pila 
	public boolean isEmty();

	//Insertar elemento siempre se inserta en la cima de las pilas 
	//no digo inserta nodo digo inserta elemento
	public void push(E element);
	
	//Quitar  elemento Siempre se quita el que esta en la cima de las pilas
	public E pop();
	
	//Mostrar el elemento que esta en la cima
	public E mostrarCima();
	
}


