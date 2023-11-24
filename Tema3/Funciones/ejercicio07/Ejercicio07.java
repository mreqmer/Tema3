package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Variables
		
		Scanner sc = new Scanner(System.in);
		//recoge el número introducido por el usuario
		int n;
		//pide datos al usuario
		System.out.print("Introduce un número: ");
		n = sc.nextInt();
		
		//devuelve un booleano si es primo o no
		System.out.println(Primo.esPrimo(n));
		
		sc.close();
		
	}

}
