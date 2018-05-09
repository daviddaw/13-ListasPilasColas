package Ejercicios1y2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean equilibrado;
		int key;
		Stack<Character> stack = new Stack<Character>();
		
		
		System.out.println("Escribe una opcion"
				+ "\n1. Ejercicio1"
				+ "\n2. Ejercicio2");
		
	key=in.nextInt();
		 
		switch (key) {
		case 1: String cadena="ROMA";
		System.out.println(cadena);
		for (int i = 0; i < cadena.length(); i++) {
			
				stack.push(cadena.charAt(i));	//insertar
			
		}
		stack.show();
			
			break;
		case 2:
			String cadena2="(2*[(5+x]-(y+z)]-3)";
			ejercicio2(cadena2);
			break;
			

		default:System.out.println("Opcion no valida");
			break;
		}

	}
	
	public static void ejercicio2(String cadena2) {
		boolean equilibrado;
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < cadena2.length(); i++) {
			if (cadena2.charAt(i)=='[' || cadena2.charAt(i)=='(') {
				stack.push(cadena2.charAt(i));	//insertar
			}
		}
		stack.show();
		System.out.println("======");
		equilibrado= true;	
		for (int i = 0; i < cadena2.length() && equilibrado==true; i++) { 
			if ((cadena2.charAt(i)==')'|| cadena2.charAt(i)==']')) {
				if (stack.top()==null) {
					System.out.println("Simbolo de cierre encontrado en la Posicion "+i+" "+cadena2.charAt(i)+" Hay mas sombolos de cierre que de apertura");
					equilibrado=false;
				}else {
					System.out.println("Simbolo  de cierre encontrado en Posicion "+i+" "+cadena2.charAt(i));
					if ((cadena2.charAt(i)==')' && stack.top()=='(') ) {						   System.out.println("( correcto" );	
						stack.pop();
					}	else if((cadena2.charAt(i)==']'&& stack.top()=='[')) {						System.out.println("[ correcto");
						stack.pop();
					}
					else
						
					if ((cadena2.charAt(i)==')' && stack.top()!='(') ) {						   System.out.println("( no correcto" );	
					
					equilibrado=false;
				}	else if((cadena2.charAt(i)==']'&& stack.top()!='[')) {						System.out.println("[ no correcto");
					
					equilibrado=false;
				}
				}
			}
		}	
		if (!stack.isEmpty()) {
			System.out.println("Hay mas simbolo de apertura que de cierre");
			equilibrado=false;
		}
		stack.show();
		System.out.println("=======");

		if (equilibrado) {
			System.out.println("la sintaxis es buena");
		}else {
			System.out.println("hay errores");
		}
		System.out.println("¿La pila esta vacia? "+stack.isEmpty());
	}
}