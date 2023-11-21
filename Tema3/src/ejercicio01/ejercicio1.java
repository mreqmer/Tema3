package ejercicio01;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		
		int n;
		//pedir núemro de repeticiones al usuario
		System.out.print("Introduce un número: ");
		n = sc.nextInt();
		//Salida de la función
		Eco.eco(n);
		sc.close();
	}

}
