package ejercicio02;

public class Contador {
	
	public static void contador(int n1, int n2) {
		
		//Recoge cual es el número mayor y cual es el menor
		int menor;
		int mayor;
		//Comprobación de que número es mayor y cual menor
		if (n1 > n2) {
			mayor = n1;
			menor = n2;
		}else {
			mayor = n2;
			menor = n1;
		}
		//muestra los númenor del menor al mayor
		for (int i=menor+1; i<mayor; i++ ) {
			System.out.print(i + " ");
		}
		
	}	
}