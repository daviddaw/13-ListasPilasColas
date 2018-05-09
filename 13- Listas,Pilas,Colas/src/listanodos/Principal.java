package listanodos;



public class Principal {

	public static void main(String[] args) {
		ListaNodos<Integer> lista = new ListaNodos<Integer>();//Le Pasamos el dato
		
		for (int i = 0; i <=9; i++) {
			lista.addFisrt(new Nodo<Integer>(i));
		}
		lista.show();
	}

}
