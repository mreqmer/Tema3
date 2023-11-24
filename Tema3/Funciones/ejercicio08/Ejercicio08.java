package ejercicio08;

import java.util.Scanner;

import ejercicio07.Primo;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("Introduce un número: ");
		n = sc.nextInt();
		Primo.esPrimo(n);
		System.out.println(DivPrimos.divPrimos(n));
		sc.close();
		
		

	}

}
