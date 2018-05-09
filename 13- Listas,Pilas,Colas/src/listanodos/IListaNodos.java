package listanodos;

public interface IListaNodos<E> {

	public boolean isEmpty();// boolean comprueba si vacio
	public Nodo<E> first();// sacar la cabeza
	public Nodo<E> last();// Sacar la cola
	public void addFisrt(Nodo<E> newNodo);// añadir nodo al princ
	public void addLast(Nodo<E> newNodo);// añadir nodo al final
	public void removeLast();// borraar el primero
	public void removeFirst();// borrar el ultimo
	public void remove(E e); //
	void meterElemento(Nodo<E> e);
	
}
