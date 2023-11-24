package ejercicio02;

import java.util.Scanner;


public class Ejercicio02 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		//Recoge los números introducidos por el usuario
		int n1, n2;
		//Pide los números al usuario
		System.out.print("Introduce el primer número: ");
		n1 = sc.nextInt();
		System.out.print("Introduce el segundo número: ");
		n2 = sc.nextInt();
		//Llama a la función para ver cual es menor y lo muestra
		Contador.contador(n1, n2);
		sc.close();	//cierre escaner
	}

}