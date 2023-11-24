package ejercicio09;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, res;
		int opciones;
		
		System.out.print("Introduce el primer número: ");
		n1 = sc.nextDouble();
		System.out.print("Introduce el segundo número: ");
		n2 = sc.nextDouble();
		System.out.print("1 suma, 2 resta, 3 multiplicación, 4 división: ");
		opciones = sc.nextInt();
		res = Calculadora.calculadora(n1, n2, opciones);
		System.out.println(res);
		sc.close();
	}

}
