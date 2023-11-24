package ejercicio09;

public class Calculadora {

	public static double calculadora(double n1, double n2, int opciones) {
		
		double resultado=0;
		
		switch(opciones) {
		case 1-> {
			resultado = n1 + n2;
		}case 2->{
			resultado = n1 - n2;
		}case 3->{
			resultado = n1 * n2;
		}case 4->{
			resultado = n1 / n2;
		}
		}
		
		return resultado;

	}

}