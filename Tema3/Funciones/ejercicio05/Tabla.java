package ejercicio05;

public class Tabla {

	public static void tabla (int n) {
		//recoge el resultado de la multiplicación
		int multi=0;
		//muestra la tabla del número introducido
		for (int i=0; i<=10; i++) {
			multi = i * n;
			System.out.println(n +  " * "+ i + " = " + multi);
		}
		 
		
	}

}
