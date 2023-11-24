package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		//guarda la letra introducida por el usuario
		char letra;
		
		//pide datos al usuario
		System.out.print("Introduce una letra: ");
		letra = sc.next().charAt(0);
		//recoge en un booleando el resultado de la función qu comprueba si es vocal o no
		boolean resultado = Vocal.vocal(letra);
		//devuelve el resultado correspondiente a true o false
		if (resultado) {
			System.out.println("Es una vocal");
		}else {
			System.out.println("No es una vocal.");
		}
		
		sc.close();
		
	}

}
