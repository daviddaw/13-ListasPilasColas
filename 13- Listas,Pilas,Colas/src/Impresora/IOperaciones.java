package Impresora;

public interface IOperaciones<E> {

	public void addRequest(E e);//agrega una solicitud y la agrega a la conjunto (
	public void printWork();//Imprime y borrra el primer elemento de la lista
	public void getNumRequest();//mostrarnumero total de solicitudes
	public void showAll();//mostrar las solicitudes que no se han impreso
	public void printAll();//imprime todas las solicitudes despues deprocesar una la elimina
	
	public void borrarPrimero();
	public E mostrarPrimero();
	public void longitud();
	public boolean colaVacia();
	void insertarCola(E e);
	
	

}
/*3.	Implementar una clase de Java para administrar una impresora en línea. La impresora puede recibir solicitudes de diferentes equipos. 
 * Las solicitudes se imprimirán por orden de llegada. 
 
Cada solicitud incluye la siguiente información: id (String) del equipo que lo realiza (por ejemplo, "id1") y el nombre del archivo para imprimir 
(por ejemplo, “archivo1.pdf”). 
El programa debe implementar las siguientes operaciones: 
•	addRequest: toma una solicitud como entrada y la agrega al conjunto de solicitudes. 
•	printWork: obtiene la primera solicitud y muestra sus datos (id y nombre del archivo) por consola (solo simula la impresión de la solicitud). 
La solicitud debe eliminarse del conjunto de solicitudes. 

•	getNumRequest: devuelve el número total de solicitudes. 
•	showAll: muestra todas las solicitudes que no se han impreso. 
•	printAll: imprime todas las solicitudes. Después de procesar una solicitud, esta debe eliminarse.  
•	Escriba un método principal que incluya las llamadas necesarias para validar todos los métodos explicados anteriormente. 
Los datos de las solicitudes a añadir se puede generar de forma automática (ejempo: id1, archivo1.pdf, etc.)
*/