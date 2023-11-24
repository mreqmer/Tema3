package ejercicio08;

import ejercicio07.Primo;

public class DivPrimos {

	public static int divPrimos(int n) {
		boolean esPrimo;
		
		int cont=0;
		
		for (int j=2; j<=n; j++) {
			esPrimo = Primo.esPrimo(j);
			if(n%j==0 && esPrimo) {
				cont++;
			}
		}
		return cont;

	}

}