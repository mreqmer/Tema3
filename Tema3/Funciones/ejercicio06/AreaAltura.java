package ejercicio06;

public class AreaAltura {

	public static double areaAltura(int opcion, double h, double r) {
		
		//constante 
		final double PI = Math.PI;
		//variable que recoge el resultado dependiendo de la operación
		double resultado=0;
		
		//menú de opciones 1(área) y 2 (volumen)
		switch (opcion) {
			case 1 -> {
				resultado = 2 * PI * r * (h + r);
			}
			case 2 -> {
				resultado = PI * Math.pow(r, 2) * h;
			}
		}
		
		return resultado;

	}

}

