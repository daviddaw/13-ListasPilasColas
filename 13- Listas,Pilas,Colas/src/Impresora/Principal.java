package Impresora;

public class Principal {

	public static void main(String[] args) {
		
		Impresora<String> impresora = new Impresora<String>();
		//Insetar Peticion solicitud
		for (int i = 1; i <= 9; i++) {
			impresora.addRequest("Archivo_"+i);
			
		}
		impresora.getNumRequest();
		
		System.out.println(" ");
		impresora.printWork();
		System.out.println(" ");
		impresora.printWork();
		System.out.println(" ");
		impresora.printWork();
		System.out.println(" ");
		impresora.printWork();
		System.out.println(" ");
		impresora.printWork();
		System.out.println(" ");
		impresora.printWork();//Solicitud 6 quedan 3 en cola
		System.out.println(" ");
		impresora.getNumRequest();
		impresora.showAll();
		System.out.println(" ");
		impresora.printAll();
		
		
	}

}
