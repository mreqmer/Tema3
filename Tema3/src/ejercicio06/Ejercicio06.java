package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Variables
		//altura
		double h;
		//radio
		double r;
		//menú de opciones
		int opcion;
		//pide datos al usuario
		System.out.print("Introduce h: ");
		h = sc.nextDouble();
		System.out.print("Introduce r: ");
		r = sc.nextDouble();
		System.out.println("Introduce la opción. 1 para área y 2 para volumen. ");
		opcion = sc.nextInt();
		//Llama a la función para mostrar el resultado de la operación
		System.out.println(AreaAltura.areaAltura(opcion, r, h));
		sc.close();//cierre escaner 
		
	}
}
