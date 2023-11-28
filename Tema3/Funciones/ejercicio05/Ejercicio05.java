package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// variables
		Scanner sc = new Scanner(System.in);
		//recoge el número introducido
		int n;
		//pide un número al usuario
		System.out.print("Introduce un número: ");
		n = sc.nextInt();
		//llama a la función para mostrar la tabla de multiplicar
		Tabla.tabla(n);
		
		
		sc.close();
	}

}
