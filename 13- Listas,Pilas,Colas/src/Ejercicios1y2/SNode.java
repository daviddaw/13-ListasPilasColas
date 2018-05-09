package Ejercicios1y2;

public class SNode<E> {
	E element;
	SNode<E> next;
	public SNode() {
		
		element = null;
		next = null;
	}
	
	
	public SNode(E element) {
		this.element = element;
		next =null;
	}


	public SNode(E element, SNode<E> next) {
		this.element = element;
		this.next = next;
	}


	public E getElement() {
		return element;
	}


	public SNode<E> getNext() {
		return next;
	}


	public void setElement(E element) {
		this.element = element;
	}


	public void setNext(SNode<E> next) {
		this.next = next;
	}
	
	public void showElement(E e) {
		e.toString();
	}
	
	
	
	
}
