package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// variables
		Scanner sc = new Scanner(System.in);
		//recoge dos números del usuario
		int n1, n2;
		//Guarda el número mayor
		int nMayor;
		//pide los números al usuario
		System.out.print("Introduce el primer número: ");
		n1 = sc.nextInt();
		System.out.print("Introduce el segundo número: ");
		n2 = sc.nextInt();
		//llama al método para comprobar cual es el número mayor
		Maximo.maximo(n1, n2);
		//recoge el número mayor en una variable
		nMayor = Maximo.maximo(n1, n2);
		//lo devuelve al usuario
		System.out.println("El número mayor es: " + nMayor);
		sc.close();//cierre de escaner

	}

}
