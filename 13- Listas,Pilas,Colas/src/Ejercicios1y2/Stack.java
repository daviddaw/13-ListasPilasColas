package Ejercicios1y2;

public class Stack<E> {
	SNode<E> head;
	int size;
	
	public Stack() {
		this.head = head;
		this.size = size;
	}
	
	
	
	public Stack(SNode<E> head) {
		this.head = head;
		size=0;
	}


	public Stack(SNode<E> head, int size) {
		this.head = head;
		this.size = size;
	}
	//Insertar elemento
	public void push(E element) {
		//la parte izquierda = recoge este valor;
	    //tipo   nombre  =  new tipo  (elementos)     
		SNode<E>  nodo   = new SNode<E>(element);//si le pasas el obnjeto usaras un constructor
		//En este punto la cabacera antigua es "head" y la sera "nodo"
		nodo.next=head;//ahora lo que contenia la "head" antigua se va al siguiente de "nodo"
		head = nodo;// Aqui damos el  valor de nodo a la cabecera
		size++;//aumentamos 1				
	}
	
	//Mostrar Cima
	public E top(){//No devuelve un nodo solo un elemento
           if (head!=null) {
        	   return head.element;//retorna un elemento, el nodo cabecera tiene tambien el siguiente nodo	
		}else {
			return null;
		}
		
				
	}
	//sacar elemento
	public E pop() {
		if (head==null) {
			System.out.println("La cabecera esta vacia");
			return null;
		}
		E borrado = head.element;//antes de borrarlo lo guardo para imprimir lo que hemos borrado
		//System.out.println("Se ha borrado"+borrado+" de la cima de la pila" );
		head=head.next;//el nodo es el nodo siguiente
		size--;
		
		
		return borrado;//devolvemos el valor del elemento borrado de la pila
		
	}
	
     public void show() {
    	     	 if (isEmpty()) {//La longitud de la lista es cero  esta vacia la lista
			System.out.println("La lista esta vacia");
		}
    	 
		SNode<E> nodo = head;//guardamos el nodo de cabecera en nuestro nodo aux
		if (nodo!=null) {
			System.out.println("La lista contiene "+size+" elementos");
		}
		while (nodo!=null) {//mientras haya un nod
			System.out.print(nodo.element);//imprimo el nodo
		   nodo=nodo.next;//y digo que el nodo es el nodo siguiente en la pila
		}
     }

	public boolean isEmpty() {
		return size==0;//Si se cumple retornara true
		
	}

}
